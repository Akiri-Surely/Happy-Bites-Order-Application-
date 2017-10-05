package com.example.akirisurely.sgdapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Akiri Surely on 7/26/2017.
 */

public class order extends ListFragment implements AdapterView.OnItemClickListener {
    TextView items;
    ListView food;
    EditText input;
    String last;
    Integer total;

//    final String[] menu = new String[]{"Burger and Fries", "Chicken and Fries", "Chinese Chicken Rice", "Moussaka",
//            "Mac and Cheese", "Samosa", "Sandwiches", "Subways", "Rolex", "Ice Cream", "Soda", "Water", "Hot Beverages",
//            "Beers, Cocktails, Wine or Spirits", "Milkshakes"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.order_frag, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.menu, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

        switch (position)
        {
            case 0:
                builder.setTitle("PLEASE SELECT QUANTITY");
                input = new EditText(getContext());
                builder.setView(input);
                builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        String num = input.getText().toString();
                        Integer count = Integer.parseInt(num);
                        last = num + " Burger Meal @ KES 400 per meal";
                        //meal1.setText(meal);
                        total = count * 400;

                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("CONFIRM ORDER");
                        builder.setView(items);
                        builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sms = last + " at " + total;

                                try
                                {
                                    Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                                    message.putExtra("sms_body", sms);
                                    startActivity(message);
                                }
                                catch (Exception e)
                                {
                                    Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                                    e.printStackTrace();
                                }

                            }
                        })
                                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        builder.show();
                    }
                })
                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                dialog.cancel();
                            }
                        });
                builder.show();
                break;

            case 1:
                builder.setTitle("PLEASE SELECT QUANTITY");
                input = new EditText(getContext());
                builder.setView(input);
                builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        String num = input.getText().toString();
                        Integer count = Integer.parseInt(num);
                        final String last = num + " Fries & Chicken @ KES 300 per meal";
                        //meal1.setText(meal);
                        final Integer total = count * 300;

                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("CONFIRM ORDER");
                        builder.setView(items);
                        builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sms = last + " at " + total;

                                try
                                {
                                    Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                                    message.putExtra("sms_body", sms);
                                    startActivity(message);
                                }
                                catch (Exception e)
                                {
                                    Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                                    e.printStackTrace();
                                }

                            }
                        })
                                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        builder.show();
                    }
                })
                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                dialog.cancel();
                            }
                        });
                builder.show();
                break;

            case 2:
                builder.setTitle("PLEASE SELECT QUANTITY");
                input = new EditText(getContext());
                builder.setView(input);
                builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        String num = input.getText().toString();
                        Integer count = Integer.parseInt(num);
                        final String last = num + " Chinese Chicken Rice @ KES 300 per meal";
                        //meal1.setText(meal);
                        final Integer total = count * 300;

                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("CONFIRM ORDER");
                        builder.setView(items);
                        builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sms = last + " at " + total;

                                try
                                {
                                    Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                                    message.putExtra("sms_body", sms);
                                    startActivity(message);
                                }
                                catch (Exception e)
                                {
                                    Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                                    e.printStackTrace();
                                }

                            }
                        })
                                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        builder.show();
                    }
                })
                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                dialog.cancel();
                            }
                        });
                builder.show();
                break;

            case 3:
                builder.setTitle("PLEASE SELECT QUANTITY");
                input = new EditText(getContext());
                builder.setView(input);
                builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        String num = input.getText().toString();
                        Integer count = Integer.parseInt(num);
                        final String last = num + " Moussaka @ KES 400 per meal";
                        //meal1.setText(meal);
                        total = count * 400;

                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("CONFIRM ORDER");
                        builder.setView(items);
                        builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sms = last + " at " + total;

                                try
                                {
                                    Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                                    message.putExtra("sms_body", sms);
                                    startActivity(message);
                                }
                                catch (Exception e)
                                {
                                    Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                                    e.printStackTrace();
                                }

                            }
                        })
                                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        builder.show();
                    }
                })
                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                dialog.cancel();
                            }
                        });
                builder.show();
                break;

            case 4:
                builder.setTitle("PLEASE SELECT QUANTITY");
                input = new EditText(getContext());
                builder.setView(input);
                builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        String num = input.getText().toString();
                        Integer count = Integer.parseInt(num);
                        last = num + " Mac 'n Cheese @ KES 300 per meal";
                        //meal1.setText(meal);
                        total = count * 300;

                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("CONFIRM ORDER");
                        builder.setView(items);
                        builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sms = last + " at " + total;

                                try
                                {
                                    Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                                    message.putExtra("sms_body", sms);
                                    startActivity(message);
                                }
                                catch (Exception e)
                                {
                                    Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                                    e.printStackTrace();
                                }

                            }
                        })
                                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        builder.show();
                    }
                })
                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                dialog.cancel();
                            }
                        });
                builder.show();
                break;

            case 5:
                builder.setTitle("PLEASE SELECT QUANTITY");
                input = new EditText(getContext());
                builder.setView(input);
                builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        String num = input.getText().toString();
                        Integer count = Integer.parseInt(num);
                        last = num + " Samosa @ KES 10 per meal";
                        //snacks1.setText(snack);
                        total = count * 10;

                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("CONFIRM ORDER");
                        builder.setView(items);
                        builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sms = last + " at " + total;

                                try
                                {
                                    Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                                    message.putExtra("sms_body", sms);
                                    startActivity(message);
                                }
                                catch (Exception e)
                                {
                                    Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                                    e.printStackTrace();
                                }

                            }
                        })
                                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        builder.show();
                    }
                })
                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                dialog.cancel();
                            }
                        });
                builder.show();
                break;

            case 6:
                builder.setTitle("PLEASE SELECT QUANTITY");
                input = new EditText(getContext());
                builder.setView(input);
                builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        String num = input.getText().toString();
                        Integer count = Integer.parseInt(num);
                        last = num + " Sandwich @ KES 50 per meal";
                        total = count * 50;

                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("CONFIRM ORDER");
                        builder.setView(items);
                        builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sms = last + " at " + total;

                                try
                                {
                                    Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                                    message.putExtra("sms_body", sms);
                                    startActivity(message);
                                }
                                catch (Exception e)
                                {
                                    Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                                    e.printStackTrace();
                                }

                            }
                        })
                                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        builder.show();
                    }
                })
                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                dialog.cancel();
                            }
                        });
                builder.show();
                break;

            case 7:
                builder.setTitle("PLEASE SELECT QUANTITY");
                input = new EditText(getContext());
                builder.setView(input);
                builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        String num = input.getText().toString();
                        Integer count = Integer.parseInt(num);
                        last = num + " Subway @ KES 150 per meal";
                        total = count * 150;

                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("CONFIRM ORDER");
                        builder.setView(items);
                        builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sms = last + " at " + total;

                                try
                                {
                                    Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                                    message.putExtra("sms_body", sms);
                                    startActivity(message);
                                }
                                catch (Exception e)
                                {
                                    Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                                    e.printStackTrace();
                                }

                            }
                        })
                                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        builder.show();
                    }
                })
                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                dialog.cancel();
                            }
                        });
                builder.show();
                break;

            case 8:
                builder.setTitle("PLEASE SELECT QUANTITY");
                input = new EditText(getContext());
                builder.setView(input);
                builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        String num = input.getText().toString();
                        Integer count = Integer.parseInt(num);
                        last = num + " Rolex @ KES 200 per meal";
                        total =  count * 200;

                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("CONFIRM ORDER");
                        builder.setView(items);
                        builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sms = last + " at " + total;

                                try
                                {
                                    Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                                    message.putExtra("sms_body", sms);
                                    startActivity(message);
                                }
                                catch (Exception e)
                                {
                                    Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                                    e.printStackTrace();
                                }

                            }
                        })
                                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        builder.show();
                    }
                })
                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                dialog.cancel();
                            }
                        });
                builder.show();
                break;

            case 9:
                builder.setTitle("PLEASE SELECT QUANTITY");
                input = new EditText(getContext());
                builder.setView(input);
                builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        String num = input.getText().toString();
                        Integer count = Integer.parseInt(num);
                        last = num + " Ice Cream @ KES 50 per meal";
                        total =  count * 50;

                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("CONFIRM ORDER");
                        builder.setView(items);
                        builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sms = last + " at " + total;

                                try
                                {
                                    Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                                    message.putExtra("sms_body", sms);
                                    startActivity(message);
                                }
                                catch (Exception e)
                                {
                                    Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                                    e.printStackTrace();
                                }

                            }
                        })
                                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        builder.show();
                    }
                })
                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                dialog.cancel();
                            }
                        });
                builder.show();
                break;

            case 10:
                builder.setTitle("PLEASE SELECT QUANTITY");
                input = new EditText(getContext());
                builder.setView(input);
                builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        String num = input.getText().toString();
                        Integer count = Integer.parseInt(num);
                        last = num + " Soda @ KES 80 per meal";
                        total =  count * 80;

                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("CONFIRM ORDER");
                        builder.setView(items);
                        builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sms = last + " at " + total;

                                try
                                {
                                    Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                                    message.putExtra("sms_body", sms);
                                    startActivity(message);
                                }
                                catch (Exception e)
                                {
                                    Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                                    e.printStackTrace();
                                }

                            }
                        })
                                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        builder.show();
                    }
                })
                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                dialog.cancel();
                            }
                        });
                builder.show();
                break;

            case 11:
                builder.setTitle("PLEASE SELECT QUANTITY");
                input = new EditText(getContext());
                builder.setView(input);
                builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        String num = input.getText().toString();
                        Integer count = Integer.parseInt(num);
                        last = num + " Water @ KES 50 per meal";
                        total =  count * 50;

                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("CONFIRM ORDER");
                        builder.setView(items);
                        builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sms = last + " at " + total;

                                try
                                {
                                    Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                                    message.putExtra("sms_body", sms);
                                    startActivity(message);
                                }
                                catch (Exception e)
                                {
                                    Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                                    e.printStackTrace();
                                }

                            }
                        })
                                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        builder.show();
                    }
                })
                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                dialog.cancel();
                            }
                        });
                builder.show();
                break;

            case 12:
                builder.setTitle("PLEASE SELECT QUANTITY");
                input = new EditText(getContext());
                builder.setView(input);
                builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        String num = input.getText().toString();
                        Integer count = Integer.parseInt(num);
                        last = num + " Hot Beverage @ KES 30 per drink";
                        total = count * 30;

                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("CONFIRM ORDER");
                        builder.setView(items);
                        builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sms = last + " at " + total;

                                try
                                {
                                    Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                                    message.putExtra("sms_body", sms);
                                    startActivity(message);
                                }
                                catch (Exception e)
                                {
                                    Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                                    e.printStackTrace();
                                }

                            }
                        })
                                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        builder.show();
                    }
                })
                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                dialog.cancel();
                            }
                        });
                builder.show();
                break;

            case 13:
                builder.setTitle("PLEASE SELECT QUANTITY");
                input = new EditText(getContext());
                builder.setView(input);
                builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        String num = input.getText().toString();
                        Integer count = Integer.parseInt(num);
                        last = num + " Beers, Cocktails, Wine or Spirits @ KES 200 per drink";
                        total = count * 200;

                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("CONFIRM ORDER");
                        builder.setView(items);
                        builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sms = last + " at " + total;

                                try
                                {
                                    Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:0716975000"));
                                    message.putExtra("sms_body", sms);
                                    startActivity(message);
                                }
                                catch (Exception e)
                                {
                                    Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                                    e.printStackTrace();
                                }

                            }
                        })
                                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        builder.show();
                    }
                })
                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                dialog.cancel();
                            }
                        });
                builder.show();
                break;

            case 14:
                builder.setTitle("PLEASE SELECT QUANTITY");
                input = new EditText(getContext());
                builder.setView(input);
                builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        String num = input.getText().toString();
                        Integer count = Integer.parseInt(num);
                        last = num + " Milkshakes @ KES 200 per drink";
                        total = count * 200;

                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("CONFIRM ORDER");
                        builder.setView(items);
                        builder.setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String sms = last + " at " + total;

                                try
                                {
                                    Intent message = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:+254703221031"));
                                    message.putExtra("sms_body", sms);
                                    startActivity(message);
                                }
                                catch (Exception e)
                                {
                                    Toast.makeText(getContext(), "SMS failed, please try again later!", Toast.LENGTH_LONG).show();
                                    e.printStackTrace();
                                }

                            }
                        })
                                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                    }
                                });
                        builder.show();
                    }
                })
                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener()
                        {
                            public void onClick(DialogInterface dialog, int id)
                            {
                                dialog.cancel();
                            }
                        });
                builder.show();
                break;

            default:
                total = 0;
                last = "";
                break;
        }
    }

}







