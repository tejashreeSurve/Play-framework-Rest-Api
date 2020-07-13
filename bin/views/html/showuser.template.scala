
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

object showuser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users : Set[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
<head>
<title>All User</title>
</head>

<body>

<h1>All User</h1>

"""),_display_(/*12.2*/for(user <- users) yield /*12.20*/{_display_(Seq[Any](format.raw/*12.21*/("""
"""),format.raw/*13.1*/("""<a href=#><h2>User-"""),_display_(/*13.21*/user/*13.25*/.userId),format.raw/*13.32*/("""</h2></a>
<h3><p> Name :- """),_display_(/*14.18*/user/*14.22*/.fName),format.raw/*14.28*/(""" """),_display_(/*14.30*/user/*14.34*/.mName),format.raw/*14.40*/(""" """),_display_(/*14.42*/user/*14.46*/.lName),format.raw/*14.52*/(""" """),format.raw/*14.53*/("""</p></h3>
<h3><p> Email :- """),_display_(/*15.19*/user/*15.23*/.userEmail),format.raw/*15.33*/(""" """),format.raw/*15.34*/("""</p></h3>
<h3><p> Password :- """),_display_(/*16.22*/user/*16.26*/.password),format.raw/*16.35*/(""" """),format.raw/*16.36*/("""</p></h3>
""")))}),format.raw/*17.2*/("""
"""),format.raw/*18.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(users:Set[User]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((Set[User]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-07-11T10:50:20.717886
                  SOURCE: /home/teju/Downloads/usermangement-play/app/views/showuser.scala.html
                  HASH: 56521c5fc0dc293293ce060f597b96fe006c65bb
                  MATRIX: 913->1|1026->21|1053->22|1154->97|1188->115|1227->116|1255->117|1302->137|1315->141|1343->148|1397->175|1410->179|1437->185|1466->187|1479->191|1506->197|1535->199|1548->203|1575->209|1604->210|1659->238|1672->242|1703->252|1732->253|1790->284|1803->288|1833->297|1862->298|1903->309|1931->310
                  LINES: 27->1|32->2|33->3|42->12|42->12|42->12|43->13|43->13|43->13|43->13|44->14|44->14|44->14|44->14|44->14|44->14|44->14|44->14|44->14|44->14|45->15|45->15|45->15|45->15|46->16|46->16|46->16|46->16|47->17|48->18
                  -- GENERATED --
              */
          