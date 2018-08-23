class Main 
{
    public static void main(String args[])
    {
        String str = "This is  a string     with more than   one space between words.";
        char[] c = str.toCharArray();
        String str1 = "";
        for(int i = 0;i<str.length()-1;i++)
        {
            if((c[i] == ' '&& c[i+1] != ' ') || (c[i] != ' '))
                str1 += c[i];
        }

        System.out.println(str1);
    }
}
