import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.*;
 
public class DomParserDemo
{
  public static void main(String[] args)
{
 
     try {
           File inputFile = new File("input.xml");
           DocumentBuilderFactory dbFactory
           =DocumentBuilderFactory.newInstance();
           DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
           Document doc = dBuilder.parse(inputFile);
           doc.getDocumentElement().normalize();
           DataInputStream in=new DataInputStream(System.in);
               String s;
               System.out.println("Enter student roll no:");
               s=in.readLine();
               int srno=Integer.parseInt(s);
 
           NodeList nList = doc.getElementsByTagName("student");
           System.out.println("Details of the student");
           System.out.println("---------------------------------");
 
             for(int temp = 0; temp < nList.getLength(); temp++)
{
             Node nNode = nList.item(temp);
 
              if(nNode.getNodeType() == Node.ELEMENT_NODE)
{
 
              Element eElement = (Element) nNode;
 
              int rno=Integer.parseInt(eElement.getAttribute("rollno"));
              if(srno==rno)
                   {
System.out.println("Student roll no : " +eElement.getAttribute("rollno"));
System.out.println("First Name : " +eElement.getElementsByTagName("firstname").item(0).getTextContent());
System.out.println("Last Name : "  +eElement.getElementsByTagName("lastname").item(0).getTextContent());
System.out.println("Nick Name : "  +eElement.getElementsByTagName("nickname").item(0).getTextContent());
System.out.println("Marks : "  +eElement.getElementsByTagName("marks").item(0).getTextContent());
}
}
                 }
       }
        catch (Exception e)
              {
        e.printStackTrace();
      }
   }
}
-------------------------------------------------------------------------
XML:
<?xml version="1.0"?>
<class>
<student rollno="1">
  <firstname>Kanithi</firstname>
  <lastname>Vasudha</lastname>
  <nickname>Va</nickname>
  <marks>100</marks>
</student>
<student rollno="2">
  <firstname>Madadapu</firstname>
  <lastname>Geetha</lastname>
  <nickname>Ge</nickname>
  <marks>95</marks>
</student>
<student rollno="3">
  <firstname>Nalemala</firstname>
  <lastname>Dharani</lastname>
  <nickname>Dha</nickname>
  <marks>90</marks>
</student>
<student rollno="4">
  <firstname>Gouryshetty</firstname>
  <lastname>Vidushee</lastname>
  <nickname>Vi</nickname>
  <marks>85</marks>
</student>
<student rollno="5">
  <firstname>Chinnakotla</firstname>
  <lastname>Joshna</lastname>
  <nickname>Jo</nickname>
  <marks>80</marks>
</student>
<student rollno="6">
  <firstname>Kanithi</firstname>
  <lastname>Himachander</lastname>
  <nickname>Hi</nickname>
  <marks>75</marks>
</student>
<student rollno="7">
  <firstname>Madadapu</firstname>
  <lastname>Tejaswini</lastname>
  <nickname>Te</nickname>
  <marks>70</marks>
</student>
<student rollno="8">
  <firstname>Garipally</firstname>
  <lastname>Vineeth</lastname>
  <nickname>Vin</nickname>
  <marks>65</marks>
</student>
<student rollno="9">
  <firstname>Kanithi</firstname>
  <lastname>Varshitha</lastname>
  <nickname>Var</nickname> 
  <marks>60</marks>
</student>
<student rollno="10">
  <firstname>Potu</firstname>
  <lastname>Vishal</lastname>
  <nickname>Vis</nickname>
  <marks>55</marks>
</student>
</class>
