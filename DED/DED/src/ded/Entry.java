/*
    Cameron Martin,
    Jared Key,
    Christopher Duong,
    Luke Higginbotham
 */
package ded;

public class Entry
{
  private String firstName;
  private String lastName;
  private String plotNumber;
  private String dateDeceased;
  private String section;
  private String graveNumber;
  private String burialNumber;


  public Entry(String fn, String ln, String pn, String date, String sec, String grave, String burialNum)
  {
    this.firstName = fn;
    this.lastName = ln;
    this.plotNumber = pn;
    this.dateDeceased = date;
    this.section = sec;
    this.graveNumber = grave;
    this.burialNumber = burialNum;

  }

  //Getter methods
  public String getFirstName()
  {
    if (firstName == null)
    {
      return " ";
    }
    else
    {
      return firstName;
    }
  }

  public String getLastName()
  {
    if (lastName == null)
    {
      return " ";
    }
    else
    {
      return lastName;
    }
  }

  public String getDateDeceased()
  {
    if (dateDeceased == null)
    {
      return " ";
    }
    else
    {
      return dateDeceased;
    }
  }

  public String getGraveNumber()
  {
    if (graveNumber == null)
    {
      return " ";
    }
    else
    {
      return graveNumber;
    }
  }

  public String getburialNumber()
  {
    if (burialNumber == null)
    {
      return " ";
    }
    else
    {
      return burialNumber;
    }
  }

  public String getPlotNumber()
  {
    if (plotNumber == null)
    {
      return " ";
    }
    else
    {
      return plotNumber;
    }
  }

  public String getSection()
  {
    if (section == null)
    {
      return " ";
    }
    else
    {
      return section;
    }
  }

}
