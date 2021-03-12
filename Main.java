import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Main
{
  public static void main(String[] args)
  {
    ArrayList<String> al = new ArrayList();
    al.add("big");
    al.add("vaccine");
    al.add("four");
    al.add("arch");

    String s = "Spam";
    

    // System.out.println(al);

    

    System.out.println(censor("Happy Birthday" , 'a'));

  }

  public static double findLargest(ArrayList<Double> a)
  {
    double largest = a.get(0);
    for(Double i: a)
    {
      if(i > largest)
      {
        largest = i;
      }
    }
    return largest;
  }

  public static int indexOfLargest(ArrayList<Double> a)
  {
    double largest = findLargest(a);
    return a.indexOf(largest);
  }

  public static int indexOfInt(ArrayList<Integer> a, int target)
  {
    for(int i: a)
    {
      if(i == target)
      {
        return a.indexOf(i);
      }
    }
    return -1;
  }

  public static boolean hasSameElements(ArrayList<Integer> a, ArrayList<Integer> b)
  {
    for(int i: a)
    {
      if(b.contains(i) != true)
      {
        return false;
      }
    }
    return true;
  }

  public static void removeEvenLength(ArrayList<String> a)
  {
    Iterator<String> iter = a.iterator();

    while(iter.hasNext())
    {
      String str = iter.next();
      if(str.length() % 2 == 0)
      {
        iter.remove();
      }
    }
  }

  public static void removeDuplicates(ArrayList<Integer> a)
  {
    for(int i = a.size()-1; i > 0; i--)
    {
      if(a.get(i) == a.get(i-1))
      {
        a.remove(i);
      }
    }
  }

  public static void swapPairs(ArrayList<String> a)
  {
    if(a.size() % 2 == 0)
    {
      for(int i = a.size() - 1; i > 0; i-=2)
      {
        String s1 = a.get(i);
        String s2 = a.get(i-1);
        a.set(i-1, s1);
        a.set(i, s2);
      }
    }
    else
    {
      for(int i = a.size() - 2; i > 0; i-=2)
      {
        String s1 = a.get(i);
        String s2 = a.get(i-1);
        a.set(i-1, s1);
        a.set(i, s2);
      }
    }
  }

  public static void doubleList(ArrayList<String> a)
  {
    for(int i = a.size() - 1; i >= 0; i--)
    {
      String str = a.get(i);
      a.add(i, str);
    }
  }

  public static void removeShorterStrings(ArrayList<String> a)
  {
    ArrayList<String> b = new ArrayList();
    for(String s: a)
    {
      b.add(s);
    }
    if(a.size() % 2 == 0)
    {
      for(int i = a.size() - 1; i >= 0; i-=2)
      {
        String s1 = b.get(i-1);
        String s2 = b.get(i);
        if(s1.length() > s2.length())
        {
          a.remove(i);
        }
        else if(s1.length() < s2.length())
        {
          a.remove(i-1);
        }
        else
        {
          a.remove(i-1);
        }
      }
    }
    else
    {
      for(int i = a.size() - 2; i >= 0; i-=2)
      {
        String s1 = b.get(i-1);
        String s2 = b.get(i);
        if(s1.length() > s2.length())
        {
          a.remove(i);
        }
        else if(s1.length() < s2.length())
        {
          a.remove(i-1);
        }
        else
        {
          a.remove(i-1);
        }
      }
    }
  }

  // Replace all occurances of character c with * in the string
  public static String censor(String s, char c)
  {
    // Option 1
    return s.replace(c, '*');

    // Option 2
    /*
    String str = "";
    for(int i = 0; i < s.length(); i++)
    {
      if(s.charAt(i) == c)
      {
        str = str + "*";
      }
      else 
      {
        str = str + str.charAt(i);
      }
    }
    return str;
    */
    
  }
}