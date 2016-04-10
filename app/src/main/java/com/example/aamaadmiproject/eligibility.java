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


public class eligibility extends android.support.v4.app.Fragment {

    TextView eligibilitytext;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_eligibility,container,false);
        String strtext=getArguments().getString("nametext");
        eligibilitytext= (TextView) v.findViewById(R.id.eligibilitytextlayout);

        if(strtext.equals("Aadhar Card"))
        {
            eligibilitytext.setText(" Resident of India.");
        }
        else if(strtext.equals("Voter ID"))
        {
            eligibilitytext.setText("To cast your vote you must be \n\n 1. At least 18 years old\n" +
                    " 2. A citizen of India and \n 3. You must have a valid Voter ID.");
        }
        else if(strtext.equals("PAN Card"))
        {
            eligibilitytext.setText("All Indian citizen are eligible to have a PAN card.People with income equal or more than the fixed limit set by Income Tax Department must have PAN Card. \n" +
                    "\n" +
                    "Individuals with incomes less than the limit set by the department can also apply for a Pan Card.\n");
        }
        else if(strtext.equals("JEE"))
        {
            eligibilitytext.setText("1. Date of Birth: Only those candidates whose date of birth falls on or after October 01, 1991 are eligible. For candidates belonging to Scheduled Caste (SC), Scheduled Tribe (ST) and Persons with Disabilities (PwD), upper age limit is relaxed by 5 years, i.e. SC, ST and PwD candidates who were born on or after October 01, 1986 are eligible. \n" +
                    "\n" +
                    "2. Year of Passing Qualifying Examination (QE): \n" +
                    "Only those candidates who have passed their Class 12th Exam or any other qualifying examination in 2014 or 2015; or those who are appearing in their Class 12th Exam or any other qualifying examination in 2016 are eligible to appear in JEE (Main) - 2016.\n" +
                    "\n" +
                    "\n" +
                    "3. Number of Attempts: \n" +
                    "The number of attempts a candidate can appear for JEE (Main) shall be limited to 03 (three).\n" +
                    "\n" +
                    "\n"
            );
        }
        else if(strtext.equals("IAS"))
        {
            eligibilitytext.setText("Find it under the downloads section\n");
        }
        else if(strtext.equals("Sarv Shiksha Abhiyan"))
        {
            eligibilitytext.setText(" All the children in the age group 6-14 are guaranteed free and compulsory education under this scheme.");
        }
        else if( strtext.equals("Jan Dhan Yojana"))
        {
            eligibilitytext.setText("Everyone is eligible for this scheme.");
        }
        else
            eligibilitytext.setText("NULL THINGY");
        return v;

    }
}
