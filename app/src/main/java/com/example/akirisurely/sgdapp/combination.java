package com.example.akirisurely.sgdapp;



import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Akiri Surely on 7/26/2017.
 */

public class combination extends Fragment {
    ImageView burger1;
    ImageView chicken;
    ImageView combo;
    ImageView combo2;
    ImageView wings;
    ImageView chinese;
    ImageView combo3;
    ImageView coupon;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.combination_frag,container, false);
        burger1 =  v.findViewById(R.id.burger1);
        chicken =  v.findViewById(R.id.chicken);
        combo=  v.findViewById(R.id.combo);
        combo2 =  v.findViewById(R.id.combo2);
        combo3 =  v.findViewById(R.id.combo3);
        wings =  v.findViewById(R.id.wings);
        chinese =  v.findViewById(R.id.chinese);
        wings.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setMessage("Are you sure, You wanted to order this");
                alertDialogBuilder.setPositiveButton("Send", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        //Toast.makeText(getContext(),"Order has been sent",Toast.LENGTH_LONG).show();
                        String sms = "Wings combo has been ordered";

                        try {
                            Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                            message.putExtra("sms_body", sms);
                            startActivity(message);
                        } catch (Exception e) {
                            Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                            e.printStackTrace();
                        }
                    }
                });
                alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }

        });
        chicken.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setMessage("Are you sure, You wanted to order this");
                alertDialogBuilder.setPositiveButton("Send", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        //Toast.makeText(getContext(),"Order has been sent",Toast.LENGTH_LONG).show();
                        String sms = "Chicken combo has been ordered";

                        try {
                            Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                            message.putExtra("sms_body", sms);
                            startActivity(message);
                        } catch (Exception e) {
                            Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                            e.printStackTrace();
                        }
                    }
                });
                alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }

        });

        chinese.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setMessage("Are you sure, You wanted to order this");
                alertDialogBuilder.setPositiveButton("Send", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        //Toast.makeText(getContext(),"Order has been sent",Toast.LENGTH_LONG).show();
                        String sms = "Chinese stir has been ordered";

                        try {
                            Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                            message.putExtra("sms_body", sms);
                            startActivity(message);
                        } catch (Exception e) {
                            Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                            e.printStackTrace();
                        }
                    }
                });
                alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }

        });
        combo2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setMessage("Are you sure, You wanted to order this");
                alertDialogBuilder.setPositiveButton("Send", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        //Toast.makeText(getContext(),"Order has been sent",Toast.LENGTH_LONG).show();
                        String sms = "Combo 2 has been ordered";

                        try {
                            Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                            message.putExtra("sms_body", sms);
                            startActivity(message);
                        } catch (Exception e) {
                            Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                            e.printStackTrace();
                        }
                    }
                });
                alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }

        });
        combo3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setMessage("Are you sure, You wanted to order this");
                alertDialogBuilder.setPositiveButton("Send", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        //Toast.makeText(getContext(),"Order has been sent",Toast.LENGTH_LONG).show();
                        String sms = "Combo 3 has been ordered";

                        try {
                            Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                            message.putExtra("sms_body", sms);
                            startActivity(message);
                        } catch (Exception e) {
                            Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                            e.printStackTrace();
                        }
                    }
                });
                alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }

        });
        burger1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setMessage("Are you sure, You wanted to order this");
                alertDialogBuilder.setPositiveButton("Send", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        //Toast.makeText(getContext(),"Order has been sent",Toast.LENGTH_LONG).show();
                        String sms = "Burger 1 has been ordered";

                        try {
                            Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                            message.putExtra("sms_body", sms);
                            startActivity(message);
                        } catch (Exception e) {
                            Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                            e.printStackTrace();
                        }
                    }
                });
                alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }

        });
        /*coupon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setMessage("Are you sure, You wanted to order this");
                alertDialogBuilder.setPositiveButton("Send", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Toast.makeText(getContext(),"Order has been sent",Toast.LENGTH_LONG).show();
                    }
                });
                alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }

        });*/
        combo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setMessage("Are you sure, You wanted to order this");
                alertDialogBuilder.setPositiveButton("Send", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        //Toast.makeText(getContext(),"Order has been sent",Toast.LENGTH_LONG).show();
                        String sms = "Combo has been ordered";

                        try {
                            Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                            message.putExtra("sms_body", sms);
                            startActivity(message);
                        } catch (Exception e) {
                            Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                            e.printStackTrace();
                        }
                    }
                });
                alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }

        });

        return v;
    }
}
