package com.ejemplos.awt;

import java.awt.*;
import java.applet.Applet;

public class Botones extends Applet {
    Button b1,b2,b3;

    public void init() {
        b1 = new Button( "Bot�n B1" );
        b2 = new Button( "Bot�n B2" );
        b3 = new Button( "Bot�n B3" );

        this.add( b1 );
        this.add( b2 );
        this.add( b3 );
        }

    public boolean action( Event evt,Object obj ) {
        if( evt.target.equals( b1 ) )
            System.out.println( "Se ha pulsado el boton B1" );
        if( evt.target.equals( b2 ) )
            System.out.println( "Se ha pulsado el boton B2" );
        if( evt.target.equals( b3 ) )
            System.out.println( "Se ha pulsado el boton B3" );

        return true;
        }
    }