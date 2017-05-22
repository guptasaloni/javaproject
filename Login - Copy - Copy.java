class Display
{
public static void main(String args[])
{
int i;
if(args.length == 0)
{
System.out.println("Error: No arguments are passed.);
System.exit(0);
}
for(i=0;i<args.length;i=i+1)
{
System.out.println("The argument[“ + i + ”] is:" + args[i]);
}
}
}