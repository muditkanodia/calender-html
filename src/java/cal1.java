import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="Calculator" width=300 height=300>
</applet>
*/

public class cal1 extends Applet implements ActionListener
{
 Button B[]= new Button[21];
 TextField tf;
 String temp="",temp2;
 String num;
 int choice;
 double number1,number2,answer;
 
 public void init()
 {
   tf=new TextField(60);
   for(int i=0;i<=9;i++)
   {
     B[i]=new Button(String.valueOf(i));
   }
  
 B[10]=new Button("+");
 B[11]=new Button("-");
 B[12]=new Button("*");
 B[13]=new Button("/");
 B[14]=new Button("=");
 B[15]=new Button("sqrt");
 B[16]=new Button("B");
 B[17]=new Button("CE");
 B[18]=new Button("C");
 B[19]=new Button("MS");
 B[20]=new Button("MR");

  add(tf);
  for(int i=0;i<=9;i++)
  {
   B[i].addActionListener(this);
   add(B[i]);
  }
 add(B[10]);
 add(B[11]);
 add(B[12]);
 add(B[13]);
 add(B[14]);
 add(B[15]);
 add(B[16]);
 add(B[17]);
 add(B[18]);
 add(B[19]);
 add(B[20]);
 B[10].addActionListener(this);
 B[11].addActionListener(this);
 B[12].addActionListener(this);
 B[13].addActionListener(this);
 B[14].addActionListener(this);
 B[15].addActionListener(this);
 B[16].addActionListener(this);
 B[17].addActionListener(this);
 B[18].addActionListener(this);
 B[19].addActionListener(this);
 B[20].addActionListener(this);
}

 public void actionPerformed(ActionEvent ae)
 {
   String str=ae.getActionCommand();
   if(str=="+")
   {
     number1=Integer.valueOf(tf.getText());
     tf.setText("");
     choice=1;
     temp="";
   }
   
  else if(str=="-")
  {
    number1=Integer.valueOf(tf.getText());
    tf.setText("");
    choice=2;
    temp="";
  }
  else if(str=="*")
  {
    number1=Integer.valueOf(tf.getText());
    tf.setText("");
    choice=3;
    temp="";
  }
  else if(str=="/")
  {
   number1=Integer.valueOf(tf.getText());
   tf.setText("");
   choice=4;
   temp="";
  }
  else if(str=="sqrt")
  {
   number1=Integer.valueOf(tf.getText());
   tf.setText(String.valueOf(Math.sqrt(number1)));
  }
  else if(str=="B")
  {
   temp2=tf.getText();
   temp=temp2.substring(0,temp2.length()-1);
   tf.setText(temp2.substring(0,temp2.length()-1));
   number2=Integer.valueOf(tf.getText());
  }
 else if(str=="CE")
 {
  temp2=null;
  tf.setText("");
  temp="";
 }
 else if(str=="C")
 {
  temp="";
  number1=0;
  number2=0;
  choice=0;
  tf.setText("");
 }
 else if(str=="MS")
 {
   temp2=tf.getText();
 }
 else if(str=="MR")
 {
  tf.setText(temp2);
 }
  
 else if(str=="=")
 {
  switch(choice)
  {
   case 1:
              answer=number1+number2;
              tf.setText(String.valueOf(answer));
              break;
   case 2:
              answer=number1-number2;
              tf.setText(String.valueOf(answer));
              break;
   case 3:
              answer=number1*number2;
              tf.setText(String.valueOf(answer));     
              break;
   case 4:
              answer=number1/number2;
              tf.setText(String.valueOf(answer));     
              break;
   }
 }
 else
  {
    temp=temp+str;
    tf.setText(temp);
    number2=Integer.valueOf(temp);
  }
}
}
