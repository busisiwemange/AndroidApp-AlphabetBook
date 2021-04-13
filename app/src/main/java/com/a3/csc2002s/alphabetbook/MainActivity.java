package com.a3.csc2002s.alphabetbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*final ArrayList<String> state = new ArrayList<String>();
        state.add("none");
        String[] str = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        final ArrayList<String> stated = new ArrayList<String>();

        for(int i = 0; i <26;i++){
            stated.add(str[i]);
        }*/

        Button a = (Button)findViewById(R.id.A);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // state.clear();
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","a");
                startActivity(intent);
                //state.add("a");
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });


        Button b = (Button)findViewById(R.id.B);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //state.clear();
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","b");
                startActivity(intent);
                //state.add("b");
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button c = (Button)findViewById(R.id.C);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //state.clear();
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","c");
                startActivity(intent);
                //state.add("c");
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button d = (Button)findViewById(R.id.D);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","d");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button e = (Button)findViewById(R.id.E);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","e");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button f = (Button)findViewById(R.id.F);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","f");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button g = (Button)findViewById(R.id.G);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","g");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button h = (Button)findViewById(R.id.H);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","h");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button i = (Button)findViewById(R.id.I);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","i");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button j = (Button)findViewById(R.id.J);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","j");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button k = (Button)findViewById(R.id.K);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","k");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button l = (Button)findViewById(R.id.L);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","l");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button m = (Button)findViewById(R.id.M);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","m");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button n = (Button)findViewById(R.id.N);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","n");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button o = (Button)findViewById(R.id.O);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","o");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button p = (Button)findViewById(R.id.P);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","p");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button q = (Button)findViewById(R.id.Q);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","q");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button r = (Button)findViewById(R.id.R);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","r");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button s = (Button)findViewById(R.id.S);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","s");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button t = (Button)findViewById(R.id.T);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","t");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button u = (Button)findViewById(R.id.U);
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","U");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button v = (Button)findViewById(R.id.V);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","v");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button w = (Button)findViewById(R.id.W);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","w");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button x = (Button)findViewById(R.id.X);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","x");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button y = (Button)findViewById(R.id.Y);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","y");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });

        Button z = (Button)findViewById(R.id.Z);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LetterPage.class);
                intent.putExtra("Button","z");
                startActivity(intent);
                //ImageView im = (ImageView) findViewById(R.id.imageView);
            }
        });
    }
    protected void onStart() {
        super.onStart();
        //Log.d(msg, "The onStart() event");
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        //Log.d(msg, "The onResume() event");
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        //Log.d(msg, "The onPause() event");
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        //Log.d(msg, "The onStop() event");
    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        //Log.d(msg, "The onDestroy() event");
    }
}