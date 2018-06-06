package com.shivansh.iiitamun18;

import android.app.Dialog;
import android.support.v4.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class ApplyNowFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.apply_as)
                .setItems(R.array.string_array_apply, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int position) {
                        switch (position) {
                            case 0:
                                Intent i = new Intent(getContext(), ApplyNow.class);
                                i.putExtra("LINK", "https://docs.google.com/forms/d/e/1FAIpQLSfHE_mLQEqx5JylrIu9mK6QtRBgPep39UoWKg6xLf1dN6i_AA/viewform?c=0&w=1");
                                startActivity(i);
                                break;
                            case 1:
                                Intent in = new Intent(getContext(), ApplyNow.class);
                                in.putExtra("LINK", "https://docs.google.com/forms/d/e/1FAIpQLScplEIggX-A3kqjI_71a2YcHyXhNYlFHUv8g4LPSqCBCWaeJg/viewform?c=0&w=1&includes_info_params=true");
                                startActivity(in);
                                break;
                        }
                    }
                });
        return builder.create();
    }
}
