package TestCases;
import javax.mail.*;  
import javax.mail.internet.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;  
import javax.activation.*; 
public class Sendmail

    { 
       //@Test
       public void  SendAttachment() throws Exception
       {  
         Thread.sleep(20000);
         String to="nihanth.reddy@maventus.com";
         String to1="hari.padyala@maventus.com";
       //String cc="nagarjuna.pach@maventus.com";//change accordingly 
       //String cc1="sivajonna@trideosystems.com";//change accordingly 
      // String bcc="prasadpadyala@trideosystems.com";//change accordingly  
         final String user="testervnr@gmail.com";//change accordingly  
         final String password="social1234";//change accordingly  
          
         
         
          //Get the session object  
          Properties props = new Properties();  
          props.put("mail.smtp.host", "smtp.gmail.com");  
          props.put("mail.smtp.socketFactory.port", "465");  
          props.put("mail.smtp.socketFactory.class",  
                    "javax.net.ssl.SSLSocketFactory");  
          props.put("mail.smtp.auth", "true");  
          props.put("mail.smtp.port", "587");  
          
          Session session = Session.getDefaultInstance(props,  
           new javax.mail.Authenticator() {  
           @Override
		protected PasswordAuthentication getPasswordAuthentication() {  
           return new PasswordAuthentication(user,password);//change accordingly  
           }  
          });  
         
         //1) get the session object     
         Properties properties = System.getProperties();  
         properties.setProperty("mail.smtp.host", "smtp.gmail.com");  
         properties.put("mail.smtp.auth", "true");  
         
         
//         Session gsession = Session.getDefaultInstance(properties,  
//          new javax.mail.Authenticator() {  
//          protected PasswordAuthentication getPasswordAuthentication() {  
//          return new PasswordAuthentication(user,password);  
//          }  
//         });  
            
         //2) compose message     
         try{  
           MimeMessage message = new MimeMessage(session);  
           message.setFrom(new InternetAddress(user));  
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to1));
         // message.addRecipient(Message.RecipientType.CC,new InternetAddress(cc)); 
          // message.addRecipient(Message.RecipientType.CC,new InternetAddress(cc1)); 
          // message.addRecipient(Message.RecipientType.BCC,new InternetAddress(bcc)); 
           DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
             Date dt = new Date();
           message.setSubject("production Navigation Automation Testing report",dateFormat.format(dt));  
             
           //3) create MimeBodyPart object and set your message text     
           BodyPart messageBodyPart1 = new MimeBodyPart();  
          // messageBodyPart1.setText("Hi");
            //4) create new MimeBodyPart object and set DataHandler object to this object      
           MimeBodyPart messageBodyPart2 = new MimeBodyPart();  
           messageBodyPart1.setText( "Dear Team,\n " +
           " production Navigation Automation testing using Selenium automation testing to find out the discrepancies, Please find the attached status report.\n" +
            " \n"    +   
            " \n"    +  
            " \n"    +  
           "Thanks & Regards, \n"+
           "QA Automation Team");
           
           Thread.sleep(20000);
           String filename = "I:\\hari\\Automation\\Workspaces\\Mavenproject\\Mavsocial\\test-output\\emailable-report.html";//change accordingly 
           DataSource source = new FileDataSource(filename);  
           messageBodyPart2.setDataHandler(new DataHandler(source));  
           messageBodyPart2.setFileName(filename);  
           
            
           //5) create Multipart object and add MimeBodyPart objects to this object      
           Multipart multipart = new MimeMultipart();  
           multipart.addBodyPart(messageBodyPart1);  
           multipart.addBodyPart(messageBodyPart2);  
         
           //6) set the multiplart object to the message object  
           message.setContent(multipart );  
            
           //7) send message  
           Transport.send(message);  
          
          System.out.println("message sent....");  
          }catch (MessagingException ex) {ex.printStackTrace();}  
        }  
       } 