package dd.com.myportfolio.helper;

import org.springframework.stereotype.Service;

@Service
public class EmailTemplate {

public String userTemplate(String name,String message){

return """
<html>
<body style="font-family:Arial;background:#f5f5f5;padding:20px">

<div style="max-width:600px;margin:auto;background:white;border-radius:10px">

<div style="background:#111;color:white;padding:20px;text-align:center">
<h2>Thank you for contacting me</h2>
</div>

<div style="padding:25px">

<p>Hello %s,</p>

<p>Your message has been received successfully.Thank you for your interest in our profile</p>

<p><b>Your Message:</b></p>

<p>%s</p>

<p>I will get back to you soon.</p>

<br>

<p>Regards</p>
<p><b>Dhinesh S</b></p>
<p>software developer</p>
</div>

</div>

</body>
</html>
""".formatted(name,message);

}

public String adminTemplate(String name,String email,String message,Long mobile){

return """
<html>
<body style="font-family:Arial;background:#f5f5f5;padding:20px">

<div style="max-width:600px;margin:auto;background:white;border-radius:10px">

<div style="background:#fcad03;padding:20px;text-align:center">
<h2>New Contact Message</h2>
</div>

<div style="padding:25px">

<p><b>Name:</b> %s</p>
<p><b>Email:</b> %s</p>
<p><b>Mobile:</b>%s</p>
<p><b>Message:</b></p>


<p>%s</p>

</div>

</div>

</body>
</html>
""".formatted(name,email,mobile,message);

}

}