package com.gebeya.gebeyaenterprise.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;

import com.gebeya.gebeyaenterprise.R;
import com.gebeya.gebeyaenterprise.base.BaseDialog;

/**
 * Created by dave-5cof on 1/29/17.
 */

public class SkillsDialog extends BaseDialog {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_skills, null);

        return new AlertDialog.Builder(getActivity())
                .setTitle(R.string.select_languages)
                .setPositiveButton(android.R.string.ok,null)
                .setView(view)
                .create();
    }
}
