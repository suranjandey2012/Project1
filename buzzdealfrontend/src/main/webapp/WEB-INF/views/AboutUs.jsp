<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AboutUs Page</title>
<style>

/*
HTML 5 Template Name: 
File: About Us - 11 CSS
Author: OS Templates
Author URI: http://www.os-templates.com/
Licence: <a href="http://www.os-templates.com/template-terms">Website Template Licence</a>
*/

#about-us{display:block; width:100%; line-height:1.6em;}
#about-us h2{margin-bottom:50px; padding-bottom:40px; font-size:80px; text-align:center; text-transform:uppercase; border-bottom:1px solid #CCCCCC;} /* DEMO USE ONLY - CAN BE DELETED */

#about-us #about-intro{margin-bottom:50px;}
#about-us #about-intro p{margin:20px 0 0 0; padding:0;}
#about-us #about-intro p:first-child{margin-top:0;}

#about-us #team{margin-bottom:0;}
#about-us #team ul{margin:0; padding:0; list-style:none;}
#about-us #team ul li{margin-bottom:30px;}
#about-us #team ul li figure{position:relative; text-align:center;}
#about-us #team ul li figure img{padding:9px; border:1px solid #CCCCCC;}
#about-us #team ul li figure figcaption{display:none; position:absolute; top:10px; left:10px; width:280px; height:200px; overflow:hidden; color:#FFFFFF; background-color:#000000; background:hsla(0, 0%, 0%, 0.8);}
#about-us #team ul li:hover figure figcaption{display:block;}
#about-us #team ul li figure figcaption p{margin:15px 15px 0 15px; padding:0;}
#about-us #team ul li figure figcaption p:first-child{margin-top:35px;}
#about-us #team ul li figure figcaption .team_name{font-weight:bold;}
#about-us #team ul li figure figcaption .team_title{margin:0; font-size:11px; line-height:normal;}
#about-us #team ul li figure figcaption .team_description{text-align:left;}

</style>
</head>
<body>
<%@ include file="Header.jsp"%>
<div>
<div class="wrapper row2">
  <div id="container" class="clear">
  
    <div id="about-us" class="clear">
    
      <section id="about-intro" class="clear">
        <h2>About Us</h2>
        <img src="images/demo/960x340.gif" alt="">
        <p style="font-family:verdana;"><b>In March 2018, Suranjan Dey started Buzzdeal.com - India's largest online marketplace, with the widest assortment of 60 million plus products across 800 categories from regional, national and international brands and retailers.</b></p>

<p "font-family:verdana"><b>With millions of users and more than 300,000 sellers, Buzzdeal is the shopping destination for Internet users across the country, delivering to 6000+ cities and towns in India.</b></p>

<p "font-family:verdana"><b>In its journey till now, Buzzdeal has partnered with several global marquee investors and individuals such as SoftBank, BlackRock, Temasek, Foxconn, Alibaba, eBay Inc., Premji Invest, Intel Capital, Bessemer Venture Partners, Mr. Ratan Tata, among others.</b></p>
      </section>
      
      <section id="team">
        <h2>Created By</h2>
        <ul class="clear">
          <li>
            <figure><img src="<c:url value="/resources/images/IMG-20180125-WA0005.jpg"/>"  width="1100" height="700" alt="my image"/>
              <figcaption>
                <p class="team_name">Suranjan Dey</p>
                <p class="team_title">Computer Science Engineering</p>
                <p class="team_description">Government College Of Engineering And Leather Technology</p>
              </figcaption>
            </figure>
          </li>
          
        </ul>
      </section>
     
    </div>
    
  </div>
</div>
</div>
<br><br><br><br>
<%@ include file="Footer.jsp"%>
</body>
</html>