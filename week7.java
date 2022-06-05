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
        catch (Exception e)
              {
        e.printStackTrace();
      }
   }
}
