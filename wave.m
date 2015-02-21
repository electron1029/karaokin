function wave()
    x = 0: pi/100: 10;
    y1 = sin (x); 
    y2 = cos (x); 
    y3 = -x.*sin(x);
    y4 = -x.*cos(x); 
    y5 = 2*x.*cos(x); 
    y6 = 2*x.*cos(2*x);
    plot (x,y6, 'linewidth',5); 
    hold on
    plot (x,y1, x,y2, x,y3, x,y4, x,y5); 
    axis off