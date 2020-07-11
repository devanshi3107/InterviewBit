public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {
        int x,n=A.length,i,j;   //3,30,34,5,9
        String s1="",s2="";
        String s3="",s4="";
        int temp;
        int c=0;
        for(x=0;x<n;x++)
        {
            if(A[x]==0)
            c++;
        }
        if(c==n)
        return "0";
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                s1=String.valueOf(A[i]); //"3"
                s2=String.valueOf(A[j]); //"34"
                s3=s1.concat(s2);      //"334"
                s4=s2.concat(s1);      //343
                if(s3.compareTo(s4)<0)  // 330<303        "334"<"343"
                {temp=A[i];
                A[i]=A[j];
                A[j]=temp;            //swap A[i] A[j]   34 30 3 5 9
                }
            }
        }
        s1="";
        for(x=0;x<n;x++)
        {
            s1=s1+String.valueOf(A[x]);
        }
        return s1;
    }
}
