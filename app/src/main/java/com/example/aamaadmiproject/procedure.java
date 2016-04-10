package com.example.aamaadmiproject;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class procedure extends android.support.v4.app.Fragment {

    TextView proceduretext;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_procedure, container, false);
        String strtext=getArguments().getString("nametext");
        proceduretext= (TextView) v.findViewById(R.id.proceduretextlayout);
        proceduretext.setMovementMethod(new ScrollingMovementMethod());

        if(strtext.equals("Aadhar Card"))
        {
            proceduretext.setText("To apply online, and check the status of your aadhar, find the details of your nearest centre and book an appointment for submitting your biometrics and the documents on the link https://resident.uidai.net.in/\n" +
                    "Visit nearest Aadhar card Enrollment center as per the schedule appointment date & time.\n" +
                    "\n" +
                    "1. Carry all required documents with you to the enrollment center.\n" +
                    "2. The official will asked you to provide duly filled application form, Xerox of        documents as well as original documents to cross check.\n" +
                    "3. Now, the operator will feed your details in aadhaar card database and you have to wait for few moment.\n" +
                    "\n" +
                    "Once it’s done now time to take your biometric details officer will take your photograph, fingerprints, and Iris scan.\n" +
                    "\n" +
                    "Since these scans are unique for everyone, they are mandatory for UDAI ( Unique Identification Authority of India).\n" +
                    "\n" +
                    "Once all the processes are done, operator may ask to cross check the details given by you. After your confirmation operator will submit it in aadhar database.\n" +
                    "After submitting the details, operator will provide you a receipt which is called “Acknowledgement Slip” and you must keep it safe because through it you can check and get your aadhaar card.\n" +
                    "\n" +
                    "Once you get the Acknowledgement Slip for aadhaar center it will take 30-90 days time to receive aadhaar card at your address.\n" +
                    "\n" +
                    "Offline forms are also available in the download link.\n");
        }
        else if(strtext.equals("Voter ID"))
        {
            proceduretext.setText("1.  The first thing in the process is to sign up for an account at election commission’s website and then submit the provided form 6 with all the documents and a passport size photograph.\n" +
                    "\n" +
                    "2. Then you are asked to submit hard copy of the documents in your regional voter registration center or workshop setup by the election commission. \n" +
                    "\n" +
                    " In the entire process you must ensure you have provided the mandatory    documents needed for applicants.\n" +
                    " Download the from 6 from the downloads section");
        }
        else if(strtext.equals("PAN Card"))
        {
            proceduretext.setText("\n" +

                    "i) An applicant will fill Form 49A online and submit the form.\n" +
                    "\n" +

                    "ii) If there are any errors, rectify them and re-submit the form.\n" +
                    "\n" +

                    "iii) A confirmation screen with all the data filled by the applicant will be displayed.\n" +
                    "\n" +
                            "iv) The applicant may either edit or confirm the same.\n" +
                    "\n" +

                    "v)  On confirmation, an acknowledgement will be displayed. The acknowledgement will   contain a unique 15-digit acknowledgement number.\n" +
                    "\n" +

                    "The applicant is requested to save and print this acknowledgement.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "'Individual' applicants should affix two recent colour photographs with white background (size 3.5 cm x 2.5 cm) in the space provided in the acknowledgement. The photographs should not be stapled or clipped to the acknowledgement. The clarity of image on PAN card will depend on the quality and clarity of photograph affixed on the acknowledgement.\n" +
                    "\n" +

                    "Signature / Left Thumb Impression should only be within the box provided in the acknowledgement. The signature should not be on the photograph affixed on right side of the form. In case of non-individual PAN applicants, the acknowledgement receipt shall be signed by the authorized signatory (Karta in case of HUF, Director in case of Company, Partner in case of Partnership Firm / LLP, Trustee in case of Trust and Authorized signatory in remaining categories). The signature should not be on photograph. If there is any mark on photograph such that it hinders the clear visibility of the face of the applicant, the application will not be accepted. \n" +
                    "\n" +

                    "Signature / Left hand thumb impression should be provided across the photo affixed on the left side of the form in such a manner that portion of signature/impression is on photo as well as on acknowledgement.\n" +
                    "\n" +

                    "Thumb impression, if used, should be attested by a Magistrate or a Notary Public or a Gazetted Officer under official seal and stamp.\n" +
                    "\n" +

                    "AADHAAR\n" +
                    "\n" +

                    "In case Aadhaar number of Individual applicant is entered in the application form, then proof of Aadhaar along with supporting documents is to be submitted to NSDL e-Gov.\n" +
                    "\n" +

                    "If copy of Aadhaar is selected as Proof of Identity/Address/date of birth, then it is mandatory to enter Aadhaar number.\n" +
                    "\n" +

                    "In case applicant is ‘MINOR’, Aadhaar of minor should be mentioned in the application form. (i.e. Do not mention Representative Assessee's Aadhaar number)\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Aadhaar number (if provided) would be authenticated using applicant’s details as mentioned in application form.\n" +
                    "\n" +

                    "If communication Address is within India\n" +
                    "\n" +

                    "(a). The fee for processing PAN application is  107.00[ (Application fee  93.00  + 14.50% service tax]. \n" +
                    "(b). Payment can be made either by\n" +
                    "Demand Draft\n" +
                    "Credit Card / Debit Card\n" +
                    "Net Banking\n" +
                    "(c). If any of addresses i.e. office address or residential address is a foreign address, the payment can be made only by way of Credit Card / Debit card and Demand Draft payable at Mumbai.\n" +

                    "If communication Address is outside India\n" +
                    "\n" +

                    "(a). The fee for processing PAN application is  989.00[ (Application fee  93.00 + Dispatch Charges  771.00) + 14.50% service tax].\n" +

                    "(b). Payment can be made only by way of Credit Card / Debit card and Demand Draft payable at Mumbai.\n" +

                    "(c). At present the facility for dispatch of PAN cards outside India is available for a select list of countries. Applicants from other countries may contact NSDL at the contact details given in point (u) below.\n" +

                    "This point is not applicable if applicant is providing the representative assessee details in the point no.14 of application form\n" +

                    "Demand draft should be drawn in favour of 'NSDL - PAN'.\n" +

                    "Demand draft shall be payable at Mumbai and the acknowledgement number should be mentioned on the reverse of the demand draft.\n" +

                    "Credit card / Debit card / Net banking payment\n" +

                    "Persons authorized to make Credit card / Debit card / Net banking payment are as below:\n" +

                    "Category of Applicant\n" +
                    "Payment by Credit Card / Debit Card / Net Banking can be made by / for\n" +
                    "Individual\n" +
                    "Self, immediate family members (parents, spouse, children)\n" +
                    "HUF\n" +
                    "Karta of the HUF\n" +
                    "Company\n" +
                    "Any Director of the Company\n" +
                    "Partnership Firm / Limited Liability Partnership\n" +
                    "Any Partner of the Firm / Limited Liability Partnership\n" +
                    "Association of Person(s) / Body of Individuals / Trust / Artificial Juridical Person / Local Authority\n" +
                    "Authorized Signatory covered under section 140 of Income Tax Act, 1961\n" +
                    "\n" +

                    "Applicants making online payment using credit card / debit card will be charged an additional charge of upto 2% (plus applicable taxes) of application fee by the bank providing gateway facility. Additionally, the conversion/exchange rates may also be levied by the card issuing bank, as per prevailing rates.\n" +
                    "\n" +

                    "Applicants making payment through Net Banking facility will be charged an additional surcharge of  4.00 + service tax for payment gateway facility.\n" +

                    "On successful credit card / debit card / net banking payment acknowledgement will be displayed. Applicant shall save and print the acknowledgement and send to NSDL as mentioned in point (q) & (r) below.To check status of online payment or to regenerate Acknowledgment receipt, please click here and fill details accordingly.\n" +

                    "(p) The acknowledgement duly signed, affixed with photograph (in case of 'Individuals') alongwith Demand Draft, if any, and proof of identity (name in the application should be same as in the proof of identity), proof of address (Individuals, HUFs, Body of Individuals, Association of Persons & Artificial Juridical Person should provide proof of address of residence stated in the application) and proof of date of birth (applicable for Individuals & Karta of HUF) as specified in the application form is to be sent to NSDL at 'Income Tax PAN Services Unit, NSDL e-Governance Infrastructure Limited, 5th floor, Mantri Sterling, Plot No. 341, Survey No. 997/8, Model Colony, Near Deep Bungalow Chowk, Pune - 411016'.\n" +

                    "(q)\n" +
                    "Superscribe the envelope with 'APPLICATION FOR PAN--- N-Acknowledgement Number' (e.g. 'APPLICATION FOR PAN--- N-881010100000097').\n" +

                    "(r)\n" +
                    "Your acknowledgement, Demand Draft, if any, and proofs, should reach NSDL within 15 days from the date of online application.\n" +

                    "(s)\n" +
                    "Applications received with demand draft as mode of payment shall be processed only on receipt of relevant proofs and realization of payment.\n" +
                    "\n" +
                    "\n");
        }
        else if(strtext.equals("JEE"))
        {
            proceduretext.setText("Aailiable for download in the link\n");
        }
        else if(strtext.equals("IAS"))
        {
            proceduretext.setText("Availiable for download in the link\n");
        }
        else if(strtext.equals("Sarv Shiksha Abhiyan"))
        {
            proceduretext.setText("Apply at the Nearest Local Primary School with the given Documents");
        }
        else if( strtext.equals("Jan Dhan Yojana"))
        {
            proceduretext.setText("Account can be opened in any bank branch or Business Correspondent (Bank Mitr) outlet. PMJDY accounts are being opened with Zero balance. However, if the account-holder wishes to get cheque book, he/she will have to fulfill minimum balance criteria.\n" +
                    "\n" +
                    "\n"
                    );
        }
        return v;

    }

}
