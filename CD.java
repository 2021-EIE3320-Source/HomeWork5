
/**
 * Write a description of class CD here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CD extends Item
{
    private String artist;
    private int numberOfTracks;
    
    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
    }
    
    public void setComment(String comment)
    {
        super.setComment(comment);
    }

    public String getComment()
    {
        return super.getComment();
    }

    public void setOwn(boolean ownIt)
    {
        super.setOwn(ownIt);
    }

    public boolean getOwn()
    {
        return super.getOwn();
    }
    
    @Override public String getPolymorphism()
    {
        return artist;
    }

    public void print()
    {
        System.out.println("CD");
        super.print();
        System.out.println("Artist: " + artist);
        System.out.println("No. of tracks: " + numberOfTracks);
    }
}
