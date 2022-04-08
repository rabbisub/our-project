package com.example.periodictable;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class DrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;


    private TextView h, He, li, be, b,c,n,o,f,ne,na,mg,al,si,p,s,cl,ar,k,ca,nb,sc,ti,v,cr,mn,fe,co,ni,cu,zn,ga,ge,as,se,br,kr;

    private TextView ubh,ubs,ubp,ubq,ubt,ubb,ubu,uue,ubn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);



        drawerLayout=findViewById(R.id.drawer_layout);

        NavigationView navigationView=findViewById(R.id.navigationId);
        navigationView.setNavigationItemSelectedListener(this);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.menu_Open,R.string.close_menu);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);






        h = findViewById(R.id.h);
        He = findViewById(R.id.he);
        li = findViewById(R.id.li);
        be = findViewById(R.id.be);
        b = findViewById(R.id.b);
        c=findViewById(R.id.c);
        n=findViewById(R.id.n);
        ubs=findViewById(R.id.ubs);
        nb=findViewById(R.id.nb);
        o=findViewById(R.id.o);
        f=findViewById(R.id.f);
        ne=findViewById(R.id.ne);
        na=findViewById(R.id.na);
        mg=findViewById(R.id.mg);
        al=findViewById(R.id.al);
        si=findViewById(R.id.si);
        p=findViewById(R.id.p);
        s=findViewById(R.id.s);
        cl=findViewById(R.id.cl);
        ar=findViewById(R.id.ar);
        k=findViewById(R.id.k);
        ca=findViewById(R.id.ca);
        sc=findViewById(R.id.sc);
        ti=findViewById(R.id.ti);
        v=findViewById(R.id.v);
        cr=findViewById(R.id.cr);
        mn=findViewById(R.id.mn);
        fe=findViewById(R.id.fe);
        co=findViewById(R.id.co);
        ni=findViewById(R.id.ni);
        cu=findViewById(R.id.cu);
        zn=findViewById(R.id.zn);
        ga=findViewById(R.id.ga);
        ge=findViewById(R.id.ge);
        as=findViewById(R.id.as);
        se=findViewById(R.id.se);
        br=findViewById(R.id.br);
        kr=findViewById(R.id.kr);

















        uue=findViewById(R.id.uue);
        ubn=findViewById(R.id.ubn);
        ubh=findViewById(R.id.ubh);
        ubu=findViewById(R.id.ubu);
        ubb=findViewById(R.id.ubb);
        ubt=findViewById(R.id.ubt);
        ubq=findViewById(R.id.ubq);
        ubp=findViewById(R.id.ubp);




        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DrawerActivity.this, hActivity.class);
                startActivity(intent);
            }
        });
        He.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DrawerActivity.this, HeActivity.class);
                startActivity(intent);
            }
        });
        li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DrawerActivity.this, LiActivity.class);
                startActivity(intent);

            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DrawerActivity.this, BeActivity.class);
                startActivity(intent);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DrawerActivity.this, BActivity.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DrawerActivity.this, CActivity.class);
                startActivity(intent);
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,NActivity.class);
                startActivity(intent);
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,OActivity.class);
                startActivity(intent);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,FActivity.class);
                startActivity(intent);
            }
        });
        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,NeActivity.class);
                startActivity(intent);
            }
        });
        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,NaActivity.class);
                startActivity(intent);
            }
        });
        mg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,MgActivity.class);
                startActivity(intent);
            }
        });
        al.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,AlActivity.class);
                startActivity(intent);
            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,SiActivity.class);
                startActivity(intent);
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,PActivity.class);
                startActivity(intent);
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,SActivity.class);
                startActivity(intent);
            }
        });
        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,ClActivity.class);
                startActivity(intent);
            }
        });
        ar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,ArActivity.class);
                startActivity(intent);
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,KActivity.class);
                startActivity(intent);
            }
        });
        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,CaActivity.class);
                startActivity(intent);
            }
        });
        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,ScActivity.class);
                startActivity(intent);
            }
        });
        ti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,TiActivity.class);
                startActivity(intent);
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,VActivity.class);
                startActivity(intent);
            }
        });
        cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,CrActivity.class);
                startActivity(intent);
            }
        });
        mn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,MnActivity.class);
                startActivity(intent);
            }
        });
        fe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,FeActivity.class);
                startActivity(intent);
            }
        });
        co.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,CoActivity.class);
                startActivity(intent);
            }
        });
        ni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,NiActivity.class);
                startActivity(intent);
            }
        });
        cu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,CuActivity.class);
                startActivity(intent);
            }
        });
        zn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,ZnActivity.class);
                startActivity(intent);
            }
        });
        ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,GaActivity.class);
                startActivity(intent);
            }
        });
        ge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,GeActivity.class);
                startActivity(intent);
            }
        });
        as.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,AsActivity.class);
                startActivity(intent);
            }
        });
        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,SeActivity.class);
                startActivity(intent);
            }
        });
        br.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,BrActivity.class);
                startActivity(intent);
            }
        });
        kr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,KrActivity.class);
                startActivity(intent);
            }
        });














        nb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,NbActivity.class);
                startActivity(intent);
            }
        });
        uue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,UueActivity.class);
                startActivity(intent);
            }
        });
        ubn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,UbnActivity.class);
                startActivity(intent);
            }
        });
        ubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,UbsActivity.class);
                startActivity(intent);
            }
        });
        ubh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,UbhActivity.class);
                startActivity(intent);
            }
        });
        ubq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,UbqActivity.class);
                startActivity(intent);
            }
        });
        ubt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,UbtActivity.class);
                startActivity(intent);
            }
        });
        ubp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,UbpActivity.class);
                startActivity(intent);
            }
        });
        ubb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,UbbActivity.class);
                startActivity(intent);
            }
        });
        ubu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DrawerActivity.this,UbuActivity.class);
                startActivity(intent);
            }
        });


    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        else if(item.getItemId()==R.id.settigId){
            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item.getItemId()==R.id.feedId){
            Intent intent=new Intent(DrawerActivity.this,FeedBackActivity.class);
            startActivity(intent);
        }
        else if (item.getItemId()==R.id.aboutId){
            Intent intent=new Intent(DrawerActivity.this,AboutActivity.class);
            startActivity(intent);

        }



        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.home_navi){
            Intent intent=new Intent(this,DrawerActivity.class);
            startActivity(intent);
        }
        else if (item.getItemId()==R.id.group_navi){
            Intent intent=new Intent(DrawerActivity.this,GroupActivity.class);
            startActivity(intent);
        }
        else if(item.getItemId()==R.id.facebook_navi){
            Intent intent=new Intent(DrawerActivity.this,FacebookActivity.class);
            startActivity(intent);
        }
        else if (item.getItemId()==R.id.instagram_navi){
            Intent intent=new Intent(DrawerActivity.this,InstagramActivity.class);
            startActivity(intent);

        }


        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.dot_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}

