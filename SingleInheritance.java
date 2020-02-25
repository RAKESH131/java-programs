class A{
int i,j;
void show ij()
{
system.out.println("i and j:"+i+""+j);}
}
class B extend A{
int k;
void show K()
{
system.out.println("k:"+k);}
void sum()
{
system.out.println(i+j+k:"+(i+j+k));}
}
class simple inheritance{
public static void main(string args[]){
A super ob = new A();
B sub ob = new B();
super ob.i=10;super ob.j=20;
system.out.println(contents of super ob:");
super ob.show ij();
sub ob i =7;
sub ob.j =8;
sub ob.k =9;
sub ob.show k();
system.out.println("sum of i,j and k in sub ob:");
sub ob.sum();
}
}
