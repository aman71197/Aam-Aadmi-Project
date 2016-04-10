package com.example.aamaadmiproject;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class intro extends android.support.v4.app.Fragment {

    TextView introtext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_intro,container,false);
        String strtext=getArguments().getString("nametext");
        introtext= (TextView) v.findViewById(R.id.introtextlayout);

        if(strtext.equals("Aadhar Card"))
        {
            introtext.setText("Aadhar is a 12-digit individual identification number issued by the Unique Identification Authority of India on behalf of the Government of India.\n" +
                    "This number will serve as a proof of identity and address, anywhere in India. Aadhaar letter received via India Post and e-Aadhaar downloaded from UIDAI website are equally valid.\n" +
                    "Each individual needs to enroll only once which is free of cost.");
        }
        else if(strtext.equals("Voter ID"))
        {
            introtext.setText("The Indian voter ID card is issued by the Election Commission of India. Its main purpose is as identity proof while casting votes. It also serves as general identity proof, address proof, and age proof for casting votes as well as for other purposes such as buying a mobile phone SIM or applying for a passport.\n\n It is also known as Electoral Photo ID Card (EPIC).");
        }
        else if(strtext.equals("PAN Card"))
        {
            introtext.setText("PAN means Permanent Account Number. \n" +
                    "PAN card is issued by Income Tax Department of India. PAN card is a ten digit alphanumeric number. It is issued in a form of laminated card.\n" +
                    "Fee of processing for PAN application is RS.94.\n" +
                    "All banks have facility to give you PAN cards.\n" +
                    "It takes about 15 to 30 days to get a PAN card after you have applied for one.");
        }
        else if(strtext.equals("JEE"))
        {
            introtext.setText("This exam conducted by the center is to get admissions into engineering  colleges such as NIT's and IIT's etc.\n");
        }
        else if(strtext.equals("IAS"))
        {
            introtext.setText("The Indian Administrative Service is the premier administrative civil service of the Government of India. IAS officers hold key and strategic positions in the Union Government, States and public-sector undertakings.\n");
        }
        else if(strtext.equals("Sarv Shiksha Abhiyan"))
        {
            introtext.setText("SSA, is an Indian Government programme aimed at the universalisation of elementary education \"in a time bound manner\", as mandated by the 86th Amendment to the Constitution of India making free and compulsory education to children between the ages of 6 to 14 (estimated to be 205 million children in 2001) a fundamental right. The programme was pioneered by former Indian Prime Minister Atal Bihari Vajpayee.");
        }
        else if( strtext.equals("Jan Dhan Yojana"))
        {
            introtext.setText("Prime Minister's People Money Scheme (PMJDY) is National Mission for Financial Inclusion to ensure access to financial services, namely Banking Savings & Deposit Accounts, Remittance, Credit, Insurance, Pension in an affordable manner.");
        }
        return v;

    }
}
