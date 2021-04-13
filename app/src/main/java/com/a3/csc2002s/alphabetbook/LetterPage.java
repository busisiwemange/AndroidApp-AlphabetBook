package com.a3.csc2002s.alphabetbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;


public class LetterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.letterpage);

        final ArrayList<String> state = new ArrayList<String>();
        state.add("none");
        String[] st = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        final ArrayList<String> stated = new ArrayList<String>();
        state.add("a");

        for(int i = 0; i <26;i++){
            stated.add(st[i]);
        }

        ImageView imge = (ImageView)findViewById(R.id.imageView);
        Bundle bundle = getIntent().getExtras();
        String str = bundle.getString("Button");

        Button a = (Button)findViewById(R.id.A);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                state.clear();
                ImageView imge = (ImageView)findViewById(R.id.imageView);
                imge.setImageResource(R.drawable.a);
                state.add("a");

                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button z = (Button)findViewById(R.id.Z);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                state.clear();
                ImageView imge = (ImageView)findViewById(R.id.imageView);
                imge.setImageResource(R.drawable.z);

                state.add("z");

                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button overview = (Button)findViewById(R.id.Overview);
        overview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LetterPage.this, MainActivity.class);
                //intent.putExtra("Button","a");
                startActivity(intent);

                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button nxt = (Button)findViewById(R.id.next);
        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index= stated.indexOf(state.get(0));
                String CurrentAlpha = stated.get(index+1);
                ImageView imge = (ImageView)findViewById(R.id.imageView);
                //imge.setImageResource(R.drawable.z);

                if(CurrentAlpha.equals("a")){
                    imge.setImageResource(R.drawable.a);}
                else if(CurrentAlpha.equals("b")){
                    imge.setImageResource(R.drawable.b);}
                else if(CurrentAlpha.equals("c")){
                    imge.setImageResource(R.drawable.c);}
                else if(CurrentAlpha.equals("d")){
                    imge.setImageResource(R.drawable.d);}
                else if(CurrentAlpha.equals("e")){
                    imge.setImageResource(R.drawable.e);}
                else if(CurrentAlpha.equals("f")){
                    imge.setImageResource(R.drawable.f);}
                else if(CurrentAlpha.equals("g")){
                    imge.setImageResource(R.drawable.g);}
                else if(CurrentAlpha.equals("h")){
                    imge.setImageResource(R.drawable.h);}
                else if(CurrentAlpha.equals("i")){
                    imge.setImageResource(R.drawable.i);}
                else if(CurrentAlpha.equals("j")){
                    imge.setImageResource(R.drawable.j);}
                else if(CurrentAlpha.equals("k")){
                    imge.setImageResource(R.drawable.k);}
                else if(CurrentAlpha.equals("l")){
                    imge.setImageResource(R.drawable.l);}
                else if(CurrentAlpha.equals("m")){
                    imge.setImageResource(R.drawable.m);}
                else if(CurrentAlpha.equals("n")){
                    imge.setImageResource(R.drawable.n);}
                else if(CurrentAlpha.equals("o")){
                    imge.setImageResource(R.drawable.o);}
                else if(CurrentAlpha.equals("p")){
                    imge.setImageResource(R.drawable.p);}
                else if(CurrentAlpha.equals("q")){
                    imge.setImageResource(R.drawable.q);}
                else if(CurrentAlpha.equals("r")){
                    imge.setImageResource(R.drawable.r);}
                else if(CurrentAlpha.equals("s")){
                    imge.setImageResource(R.drawable.s);}
                else if(CurrentAlpha.equals("t")){
                    imge.setImageResource(R.drawable.t);}
                else if(CurrentAlpha.equals("u")){
                    imge.setImageResource(R.drawable.u);}
                else if(CurrentAlpha.equals("v")){
                    imge.setImageResource(R.drawable.v);}
                else if(CurrentAlpha.equals("w")){
                    imge.setImageResource(R.drawable.w);}
                else if(CurrentAlpha.equals("x")){
                    imge.setImageResource(R.drawable.x);}
                else if(CurrentAlpha.equals("y")){
                    imge.setImageResource(R.drawable.y);}
                else if(CurrentAlpha.equals("z")){
                    imge.setImageResource(R.drawable.z);}

                state.clear();
                state.add(CurrentAlpha);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button prv = (Button)findViewById(R.id.prev);
        prv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index= stated.indexOf(state.get(0));
                String CurrentAlpha = stated.get(index-1);
                ImageView imge = (ImageView)findViewById(R.id.imageView);
                //imge.setImageResource(R.drawable.z);

                if(CurrentAlpha.equals("a")){
                    imge.setImageResource(R.drawable.a);}
                else if(CurrentAlpha.equals("b")){
                    imge.setImageResource(R.drawable.b);}
                else if(CurrentAlpha.equals("c")){
                    imge.setImageResource(R.drawable.c);}
                else if(CurrentAlpha.equals("d")){
                    imge.setImageResource(R.drawable.d);}
                else if(CurrentAlpha.equals("e")){
                    imge.setImageResource(R.drawable.e);}
                else if(CurrentAlpha.equals("f")){
                    imge.setImageResource(R.drawable.f);}
                else if(CurrentAlpha.equals("g")){
                    imge.setImageResource(R.drawable.g);}
                else if(CurrentAlpha.equals("h")){
                    imge.setImageResource(R.drawable.h);}
                else if(CurrentAlpha.equals("i")){
                    imge.setImageResource(R.drawable.i);}
                else if(CurrentAlpha.equals("j")){
                    imge.setImageResource(R.drawable.j);}
                else if(CurrentAlpha.equals("k")){
                    imge.setImageResource(R.drawable.k);}
                else if(CurrentAlpha.equals("l")){
                    imge.setImageResource(R.drawable.l);}
                else if(CurrentAlpha.equals("m")){
                    imge.setImageResource(R.drawable.m);}
                else if(CurrentAlpha.equals("n")){
                    imge.setImageResource(R.drawable.n);}
                else if(CurrentAlpha.equals("o")){
                    imge.setImageResource(R.drawable.o);}
                else if(CurrentAlpha.equals("p")){
                    imge.setImageResource(R.drawable.p);}
                else if(CurrentAlpha.equals("q")){
                    imge.setImageResource(R.drawable.q);}
                else if(CurrentAlpha.equals("r")){
                    imge.setImageResource(R.drawable.r);}
                else if(CurrentAlpha.equals("s")){
                    imge.setImageResource(R.drawable.s);}
                else if(CurrentAlpha.equals("t")){
                    imge.setImageResource(R.drawable.t);}
                else if(CurrentAlpha.equals("u")){
                    imge.setImageResource(R.drawable.u);}
                else if(CurrentAlpha.equals("v")){
                    imge.setImageResource(R.drawable.v);}
                else if(CurrentAlpha.equals("w")){
                    imge.setImageResource(R.drawable.w);}
                else if(CurrentAlpha.equals("x")){
                    imge.setImageResource(R.drawable.x);}
                else if(CurrentAlpha.equals("y")){
                    imge.setImageResource(R.drawable.y);}
                else if(CurrentAlpha.equals("z")){
                    imge.setImageResource(R.drawable.z);}
                state.clear();
                state.add(CurrentAlpha);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });



        if(str.equals("a")){
            state.clear();
            imge.setImageResource(R.drawable.a);
            state.add("a");
        }
        else if(str.equals("b")){
            state.clear();
            imge.setImageResource(R.drawable.b);
            state.add("b");
        }
        else if(str.equals("c")){
            state.clear();
            imge.setImageResource(R.drawable.c);
            state.add("c");
        }
        else if(str.equals("d")){
            state.clear();
            imge.setImageResource(R.drawable.d);
            state.add("d");
        }
        else if(str.equals("e")){
            imge.setImageResource(R.drawable.e);
            state.add("e");
        }
        else if(str.equals("f")){
            state.clear();
            imge.setImageResource(R.drawable.f);
            state.add("f");
        }
        else if(str.equals("g")){state.clear();
            state.clear();
            imge.setImageResource(R.drawable.g);
            state.add("g");
        }
        else if(str.equals("h")){
            state.clear();
            imge.setImageResource(R.drawable.h);
            state.add("h");
        }
        else if(str.equals("i")){
            state.clear();
            imge.setImageResource(R.drawable.j);
            state.add("i");
        }
        else if(str.equals("j")){
            state.clear();
            imge.setImageResource(R.drawable.j);
            state.add("j");
        }
        else if(str.equals("k")){
            state.clear();
            imge.setImageResource(R.drawable.k);
            state.add("k");
        }
        else if(str.equals("l")){
            state.clear();
            imge.setImageResource(R.drawable.l);
            state.add("l");
        }
        else if(str.equals("m")){
            state.clear();
            imge.setImageResource(R.drawable.m);
            state.add("m");
        }
        else if(str.equals("n")){
            state.clear();
            imge.setImageResource(R.drawable.n);
            state.add("n");
        }
        else if(str.equals("o")){
            state.clear();
            imge.setImageResource(R.drawable.o);
            state.add("o");
        }
        else if(str.equals("p")){
            state.clear();
            imge.setImageResource(R.drawable.p);
            state.add("p");
        }
        else if(str.equals("q")){
            state.clear();
            imge.setImageResource(R.drawable.q);
            state.add("q");
        }
        else if(str.equals("r")){
            state.clear();
            imge.setImageResource(R.drawable.r);
            state.add("r");
        }
        else if(str.equals("s")){
            state.clear();
            imge.setImageResource(R.drawable.s);
            state.add("s");
        }
        else if(str.equals("t")){
            state.clear();
            imge.setImageResource(R.drawable.t);
            state.add("t");
        }
        else if(str.equals("u")){
            state.clear();
            imge.setImageResource(R.drawable.u);
            state.add("u");
        }
        else if(str.equals("v")){
            state.clear();
            imge.setImageResource(R.drawable.v);
            state.add("v");
        }
        else if(str.equals("w")){
            state.clear();
            imge.setImageResource(R.drawable.w);
            state.add("w");
        }
        else if(str.equals("x")){
            state.clear();
            imge.setImageResource(R.drawable.x);
            state.add("x");
        }
        else if(str.equals("y")){
            state.clear();
            imge.setImageResource(R.drawable.y);
            state.add("y");
        }
        else if(str.equals("z")){
            state.clear();
            imge.setImageResource(R.drawable.z);
            state.add("z");
        }



    }
}
