import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Database
{
    private ArrayList<Item> items;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        items = new ArrayList<Item>();
    }

    /**
     * Add an item to the database.
     */
    public void addItem(Item theItem)
    {
        items.add(theItem);
    }

    /**
     * Print a list of all currently stored CDs and videos to the
     * text terminal.
     */
    public void list()
    {
        for(Iterator iter = items.iterator(); iter.hasNext(); )
        {
            Item item = (Item)iter.next();
            item.print();
            System.out.println();   // empty line between items
        }
    }
    
    public Item searchByTitle(String theTitle)
    {
        for(Iterator iter = items.iterator(); iter.hasNext(); )
        {
            Item item = (Item)iter.next();
            if(item.getTitle() == theTitle)
            {
                return item;
            }
        }
        return null;
    }
    
    public Item searchByTitlePattern(String pat)
    {
        Pattern pattern = Pattern.compile(pat, Pattern.CASE_INSENSITIVE);
        for(Iterator iter = items.iterator(); iter.hasNext(); )
        {
            Item item = (Item)iter.next();
             
    Matcher matcher = pattern.matcher(item.getTitle());
   
            
            if(matcher.find())
            {
                return item;
            }
        }
        return null;
    }
    
    public Item searchByPattern(String pat)
    {
        Pattern pattern = Pattern.compile(pat, Pattern.CASE_INSENSITIVE);
        for(Iterator iter = items.iterator(); iter.hasNext(); )
        {
            Item item = (Item)iter.next();
             
    Matcher matcher = pattern.matcher(item.getTitle());
   Matcher matcher1 = pattern.matcher(item.getComment());
   Matcher matcher2 = pattern.matcher(item.getPolymorphism());
            
            if(matcher.find())
            {
                return item;
            }
            
   
            
            if(matcher1.find())
            {
                return item;
            }
      
   
            
            if(matcher2.find())
            {
                return item;
            }
        }
        return null;
    }
}
