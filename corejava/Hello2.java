public class Hello2{
public static void main(String args[]){
int a[]=new int[args.length];
int s;
for(int i=0;i<args.length;i++){
a[i]=Integer.parseInt(args[i]);
}
for(int i=0;i<a.length;i++)
{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				s=a[i];
				a[i]=a[j];
				a[j]=s;
			}
		}
}
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}

}

}