package com.example.aamaadmiproject;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class apply extends android.support.v4.app.Fragment {

    TextView applytext;
    Button applybutton;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_apply,container,false);
        String strtext=getArguments().getString("nametext");
        applytext= (TextView) v.findViewById(R.id.applytextlayout);
        applybutton= (Button) v.findViewById(R.id.applybutton);

        if(strtext.equals("Aadhar Card"))
        {
            applytext.setText("Please note that you CAN NOT apply for AADHAAR card online. You can ONLY apply for an appointment date online, or to select enrollment centers."+'\n');
            applybutton.setText("Book an Appointment");
            applybutton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    try {
                        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://appointments.uidai.gov.in/"));
                        startActivity(myIntent);
                    } catch (ActivityNotFoundException e) {
                        Toast.makeText(getActivity(), "No application can handle this request."
                                + " Please install a web browser", Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }

                }
            });
        }
        else if(strtext.equals("Voter ID"))
        {
            applytext.setText("The list of forms available in both English and Hindi are available.");
            applybutton.setText("Download Forms");
            applybutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://eci.nic.in/eci_main1/forms_Voters.aspx"));
                        startActivity(myIntent);
                    } catch (ActivityNotFoundException e) {
                        Toast.makeText(getActivity(), "No application can handle this request."
                                + " Please install a web browser", Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }

                }
            });


        }
        else if(strtext.equals("PAN Card"))
        {
            applytext.setText("You can Apply for a NEW PAN card online Too");
            applybutton.setText("Apply Online");
            applybutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://tin.tin.nsdl.com/pan/"));
                        startActivity(myIntent);
                    } catch (ActivityNotFoundException e) {
                        Toast.makeText(getActivity(), "No application can handle this request."
                                + " Please install a web browser", Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }

                }
            });
        }
        else if(strtext.equals("JEE"))
        {
            applytext.setText("The JEE Advanced 2016 Information Brochure is available for Download");
            applybutton.setText("Download Brochure");
            applybutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jeeadv.ac.in/info_brochure"));
                        startActivity(myIntent);
                    } catch (ActivityNotFoundException e) {
                        Toast.makeText(getActivity(), "No application can handle this request."
                                + " Please install a web browser", Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }

                }
            });

        }
        else if(strtext.equals("IAS"))
        {
            applytext.setText("The Information about IAS exam is provided on the UPSC website\n");
            applybutton.setText("Check Website");
            applybutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.upsc.gov.in/"));
                        startActivity(myIntent);
                    } catch (ActivityNotFoundException e) {
                        Toast.makeText(getActivity(), "No application can handle this request."
                                + " Please install a web browser", Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }

                }
            });

        }
        else if(strtext.equals("Sarv Shiksha Abhiyan"))
        {
            applytext.setText("Check the Website for More information ");
            applybutton.setText("Check Website");
            applybutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ssa.nic.in/"));
                        startActivity(myIntent);
                    } catch (ActivityNotFoundException e) {
                        Toast.makeText(getActivity(), "No application can handle this request."
                                + " Please install a web browser", Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }

                }
            });


        }
        else if( strtext.equals("Jan Dhan Yojana"))
        {
            applytext.setText("The form for the Yojana is availabe on the PMJDY Website");
            applybutton.setText("Download Form");
            applybutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://pmjdy.gov.in/pdf/account_form.pdf"));
                        startActivity(myIntent);
                    } catch (ActivityNotFoundException e) {
                        Toast.makeText(getActivity(), "No application can handle this request."
                                + " Please install a web browser", Toast.LENGTH_LONG).show();
                        e.printStackTrace();
                    }

                }
            });



        }
        else
            applytext.setText("NULL THINGY");
        return v;

    }
    

}
