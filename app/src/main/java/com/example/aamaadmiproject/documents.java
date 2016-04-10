package com.example.aamaadmiproject;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.TextView;


public class documents extends android.support.v4.app.Fragment {

    TextView documentstext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        String strtext=getArguments().getString("nametext");
        View v= inflater.inflate(R.layout.fragment_documents, container, false);

        documentstext= (TextView) v.findViewById(R.id.documentstextlayout);
        if(strtext.equals("Aadhar Card"))
        {
            documentstext.setText("1. You will need just 1 document for \"Proof of Identity\", 1 document for \"Proof of Address\" and 1 document for \"Proof of Date of Birth\". \n" +
                    "\n\n2. Please take 1 Xerox copy of each of the supporting AADHAR card documents you are submitting for AADHAR card and submit it along with the AADHAR card application form\n" +
                    "\n\n3. Small kids may not have any address proof; in that case submit parents/guardians address proof document copy for them.\n");
        }
        else if(strtext.equals("Voter ID"))
        {
            documentstext.setText(" 1. A passport size photo \n\n 2. Valid Address proof \n\n 3. ID proof \n \n 4. Duly filled in Form 6 . (Link in Downloads)");

        }
        else if(strtext.equals("PAN Card"))
        {
            documentstext.setText("1.   ID proof\n" +
                    "\n2.  Address proof   \n" +
                    "\n3.  Date Of Birth proof\n" +
                    " \n" +
                    "Please take a xerox copy of each of the documents.\n");
        }
        else if(strtext.equals("JEE"))
        {
            documentstext.setText("Refer to the Website \n");
        }
        else if(strtext.equals("IAS"))
        {
            documentstext.setText("Refer to The website\n");
        }
        else if(strtext.equals("Sarv Shiksha Abhiyan"))
        {
            documentstext.setText("1. Age Proof" +
                    "\n\n 2. Identity and Adress Proof");
        }
        else if( strtext.equals("Jan Dhan Yojana"))
        {
            documentstext.setText("1. If Aadhar Card/Aadhar Number is available then no other documents is required. If address has changed, then a self certification of current address is sufficient.\n" +
                    "\n" +
                    "\n" +
                    "2. If Aadhar Card is not available, then one of the following Officially Valid Documents (OVD) is required: \n" +
                    "\n" +
                    " Voter ID Card\n" +
                    " Driving License\n" +
                    " PAN Card\n" +
                    " Passport \n" +
                    " NREGA Card\n" +
                    "\n" +
                    "3. If these documents also contain your address, it can serve both as Proof of Identity and Address.\n" +
                    "\n"

                    );
        }
        return v;

    }
}
