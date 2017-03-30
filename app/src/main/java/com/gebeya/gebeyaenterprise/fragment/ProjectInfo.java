package com.gebeya.gebeyaenterprise.fragment;

import android.app.Activity;
import android.content.ContentProvider;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.gebeya.gebeyaenterprise.base.BaseScreen;
import com.gebeya.gebeyaenterprise.R;
import com.gebeya.gebeyaenterprise.model.User;
import com.gebeya.gebeyaenterprise.utils.BlurBuilder;

/**
 * Created by dave-5cof on 1/26/17.
 */

public class ProjectInfo extends BaseScreen{

    private static final int REQUEST_CONTACT = 1;

    private Button mFindContactButton;
    private Button mCallButton;

    User mUser = new User();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRoot = inflater.inflate(R.layout.project_info, container, false);
        initViews();


        Bitmap bgImage = BitmapFactory.decodeResource(getActivity().getResources(),
                R.drawable.africabackground);
        Bitmap blurredBitmap = BlurBuilder.blur( getActivity(), bgImage );

        mRoot.setBackground(new BitmapDrawable (getResources(), blurredBitmap));

        mFindContactButton = (Button) mRoot.findViewById(R.id.button_find_contact);

        final Intent pickContact = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);

        mFindContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(pickContact, REQUEST_CONTACT);
            }
        });

        PackageManager packageManager = getActivity().getPackageManager();
        if (packageManager.resolveActivity(pickContact, PackageManager.MATCH_DEFAULT_ONLY) == null)
        {
            mFindContactButton.setEnabled(false);
        }

        mCallButton = (Button) mRoot.findViewById(R.id.button_call);
        mCallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);

            }
        });
        return mRoot;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode != Activity.RESULT_OK)
            return;

        if (requestCode == REQUEST_CONTACT && data != null){
            Uri contactUri = data.getData();

            String[] queryFields = new String[]{ContactsContract.Contacts.DISPLAY_NAME, ContactsContract.Contacts._ID};

            Cursor cursor = getActivity().getContentResolver().query(contactUri, queryFields, null, null, null);

            try{
                if (cursor.getCount()== 0)
                    return;

                cursor.moveToFirst();
                String suspect = cursor.getString(0);

                mFindContactButton.setText(suspect);
            }
            finally {
                cursor.close();
            }
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void setListeners() {

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_main, menu);
    }
}
