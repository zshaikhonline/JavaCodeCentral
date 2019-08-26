package cm.qa.polymorphism;

public class OverloadDemo {

public int add( int a,int b) {
int rs=a+b;
return rs;

}
public int add( int a,int b,int c) {

int rs=a+b+c;
return rs;
}
public static void main(String[] args) {

OverloadDemo ov=new OverloadDemo();
System.out.println(ov.add(23,56,45));
System.out.println(ov.add(23,56));
}

}
