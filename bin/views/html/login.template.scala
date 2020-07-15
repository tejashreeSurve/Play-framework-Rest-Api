
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm:Form[Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*1.27*/import helper._


Seq[Any](format.raw/*1.25*/(""" """),format.raw/*2.1*/("""<html>
<head>
<title>Login</title>
</head>
<body>
	<h1>------Login Here----</h1>

	<form action=""""),_display_(/*9.17*/routes/*9.23*/.HomeController.signUp()),format.raw/*9.47*/("""" method="POST">
		<br> <label><h3>Email :-</h3></label>
		 <input name="userEmail" type="text"> <br> 
		 <label><h3>Password :-</h3>
		<input name="password" type="password"> <br> <br> 
		<input type="submit" value="Login">
</body>
</html>"""))
      }
    }
  }

  def render(loginForm:Form[Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-15T15:37:55.346218
                  SOURCE: /home/teju/Downloads/usermangement-play/app/views/login.scala.html
                  HASH: 1eedec2c016ad2721096c83018a509e993a30f42
                  MATRIX: 912->1|1009->26|1054->24|1081->42|1205->140|1219->146|1263->170
                  LINES: 27->1|30->1|33->1|33->2|40->9|40->9|40->9
                  -- GENERATED --
              */
          