package hu.bme.mit.inf.mdsd.reportgenerator.templates

import hu.bme.mit.inf.mdsd.reportgenerator.helper.GeneratorHelper;
import model.Match;
import model.Player;
import model.StaffMember;
import model.Event;
import model.EventType;

class MatchGenerator {
		
	def generateDataModel(Match dataModel) {
		System::out.println("code generation for " + dataModel.eResource.URI)
		GeneratorHelper::createHTMLFile(dataModel.eResource, dataModel.id.toString, true, dataModel.compile);
	}
	
	def get_goals(Event e) '''
	<div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('«e.committer.id»');">
	<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
		<tr>
			<td class="ASCR10" width="20" height="15">«e.time/60»'</td>
			<td width="4"></td>
			<td class="URES_SZURKE" width="1"></td>
			<td width="5"></td>
			<td class="FEKETE_TRANSPARENT_CL11" width="265">«e.committer.name.toUpperCase»</td>
			<td class="FEKETE_TRANSPARENT_CL10" width="4"></td>
			<td class="URES_SZURKE" width="1"></td>
			<td class="FEKETE_TRANSPARENT_CR11" width="50">«e.committer.id»</td>
		</tr>
	</table>
	</div>
	<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
		<tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
	</table>
	'''
	
	def get_cards(Event e) '''
	<div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('«e.committer.id»');">
		<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
			<tr>
				<td class="FEKETE_TRANSPARENT_CR10" width="20" height="15">«e.time/60»'</td>
				<td width="4"></td>
				<td class="URES_SZURKE" width="1"></td>
				<td width="5"></td>
				<td class="FEKETE_TRANSPARENT_CL11" width="215">«e.committer.name.toUpperCase»</td>
				<td class="URES_SZURKE" width="1"></td>
				<td width="4"></td>
				«IF (e.type == EventType::RED_CARD)»<td class=GACC09 width="49">piros lap</td>«ENDIF»
				«IF (e.type == EventType::YELLOW_CARD)»<td class=HACC09 width="49">sárga lap</td>«ENDIF»
				«IF (e.type == EventType::RED_CARD_WITH_BAN)»<td class=GACC09 width="49">piros lap kiállítással</td>«ENDIF»
				<td class="URES_SZURKE" width="1"></td>
				<td class="FEKETE_TRANSPARENT_CR11" width="50">«e.committer.id»</td>
			</tr>
		</table>
	</div>
	<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
		<tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
	</table>
	'''
	
	def get_evad(Match match) {
		return('''IDE JÖN AZ ÉVAD''')
	}
	
	def get_players(Player p) '''
	<div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('«p.teamMember.id»');">
		<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
			<tr>
				<td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">«p.shirtNo»</td>
				<td width="4"></td>
				<td class="URES_SZURKE" width="1"></td>
				<td width="5"></td>
				<td class="FEKETE_TRANSPARENT_CL11" width="269">«p.name.toUpperCase»</td>
				<td class="URES_SZURKE" width="1"></td>
				<td class="FEKETE_TRANSPARENT_CR11" width="50">«p.teamMember.id»</td>
			</tr>
		</table>
	</div>
	<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
		<tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
	</table>
	'''
	
	def get_staffs(StaffMember s) '''
	<div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';">
		<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
			<tr>
				<td class="FEKETE_TRANSPARENT_CL11" width="215" height="15">«s.name.toUpperCase»</td>
				<td class="FEKETE_TRANSPARENT_CL09" width="84">«s.role»</td>
				<td class="URES_SZURKE" width="1"></td>
				<td class="FEKETE_TRANSPARENT_CR11" width="50">«s.teamMember.id»</td>
			</tr>
		</table>
	</div>
	<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
		<tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
	</table>
	''' 
	
		

	def compile(Match match) '''
<!DOCTYPE html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=windows-1250" />
	<meta http-equiv="Content-Language" content="hu" />
	<meta name="title" content="Magyar Labdarúgó Szövetség Adatbank" />
	<meta name="description" content="Magyar Labdarúgó Szövetség Adatbank" />
	<meta name="keywords" content="mlsz foci labdarúgás football adatbank" />
	<meta name="language" content="magyar" />
	<meta name="copyright" content="BME MIT FTSRG MDSD Team 1" />
	<meta name="robots" content="index, follow, all" />
	<meta name="distribution" content="Global" />
	<meta name="revisit-after" content="1 Week" />
	<meta name="rating" content="General" />
	<meta name="doc-type" content="Web Page" />
	<meta http-equiv="imagetoolbar" content="no" />
	<title>Magyar Labdarúgó Szövetség adatbankja</title>
	<link rel="stylesheet" href="http://adatbank.mlsz.hu/_include/include.css" type="text/css">
	<script type="text/javascript" src="http://adatbank.mlsz.hu/_include/util.js"></script>
	<script type="text/VBScript" src="http://adatbank.mlsz.hu/_include/utilvb.js"></script>
</head>
<body topmargin="0" leftmargin="0" link="#000080" vlink="#000080" alink="#000080" OnKeyDown="ProcessKeyDown();">
<DIV id=overDiv style="Z-INDEX: 1000; VISIBILITY: hidden; POSITION: absolute"></DIV>
<SCRIPT language="VBScript">
function ProcessKeyDown()
   Dim WinEvent
   Set WinEvent = window.event
   if WinEvent.keycode = 13 Then
      WinEvent.keycode = 9
   End if
End function
</SCRIPT>
<body topmargin="0" leftmargin="0" link="#000080" vlink="#000080" alink="#000080" OnKeyDown="ProcessKeyDown();" style="background: url('/images/hatter/bg_homok.jpg') repeat-x;">
<center>
 
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" width="740" height="600">
   <tr>
      <td width="10"></td>
      <td valign="top">
         
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr>
      <td class="URES_BARNA" width="10"></td>
      <td class="FEHER_BARNA_CL13" width="360" height="30"><b>«match.type»</b></td>
      <td class="FEHER_BARNA_CR13" width="340"><b>Magyar Labdarúgó Szövetség</b></td>
      <td class="URES_BARNA" width="10"></td>
   </tr>
</table> 
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr>
      <td class="URES_HATTER_1" width="10"></td>
      <td class="BARNA_HATTER_1_CL13" width="220" height="25">«match.date.toString»<b></b></td>
      <td class="BARNA_HATTER_1_CR13" width="500"><b>«match.location»</b></td>
      <td class="URES_HATTER_1" width="10"></td>
   </tr>
</table> 
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr><td class="URES_BARNA" width="720"></td></tr>
</table> 
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr>            
      <td class="FEKETE_TRANSPARENT_CC14" width="314" height="36">
         <b>
         «match.home.name»
         </b>
      </td>            
      <td>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" background="http://adatbank.mlsz.hu/images/hatter/eredmeny_72x36.jpg">
            <tr>
               <td>
                  <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
                     <tr><td class="FEHER_TRANSPARENT_CC18" width="72" height="21"><b>«match.home.goalCount» - «match.visitor.goalCount»</b></td></tr>
                     <tr><td class="FEHER_TRANSPARENT_CC11" width="72" height="14"><b>«match.home.goalCountHT» - «match.visitor.goalCountHT»</b></td></tr>
                  </table>
               </td>
            </tr>
         </table>
      </td>
      <td class="FEKETE_TRANSPARENT_CC14" width="314">
         <b>
         «match.visitor.name»
         </b>
      </td>
   </tr>            
</table>

<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr><td class="URES_BARNA" width="720" height="1"></td></tr>
</table>
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr>         
      <td class="URES_HATTER_1">
        <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td width="10"></td>         
               <td class="FEKETE_TRANSPARENT_CL10" width="65" height="20">játékvezetõ:</td>
               <td width="165">
                  
                  <div class="MOff" style="cursor: pointer;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekvezeto_nez_p01_jegyzokonyv_nez_1('2692');">         
                  <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
                     <tr><td class="FEKETE_TRANSPARENT_CL10" width="165"><b>«match.referee.name.toUpperCase»</b></td></tr>
                  </table>
                  </div>
                  
               </td> 
               <td class="URES_SZURKE" width="1"></td>
               <td width="4"></td>
               <td class="FEKETE_TRANSPARENT_CL10" width="65">asszisztens:</td>
               <td width="165">
                  
                  <div class="MOff" style="cursor: pointer;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekvezeto_nez_p01_jegyzokonyv_nez_1('349602');">         
                  <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
                     <tr><td class="FEKETE_TRANSPARENT_CL10" width="165"><b>«match.assistant.name.toUpperCase»</b></td></tr>
                  </table>
                  </div>
                  
               </td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="4"></td>
               <td class="FEKETE_TRANSPARENT_CL10" width="65">ellenõr:</td>
               <td width="165">
                  
                  <div class="MOff" style="cursor: pointer;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';">         
                  <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
                     <tr><td class="FEKETE_TRANSPARENT_CL10" width="165">«match.supervisor.name.toUpperCase»</td></tr>
                  </table>
                  </div>
                  
               </td>
               <td width="10"></td> 
            </tr>
            <tr>         
               <td width="10"></td> 
               <td class="FEKETE_TRANSPARENT_CL10" width="65" height="20">tartjv.:</td>
               <td width="165">
                  
               </td> 
               <td class="URES_SZURKE" width="1"></td>
               <td width="4"></td>
               <td width="65"></td>
               <td width="165">
                  
                  <div class="MOff" style="cursor: pointer;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekvezeto_nez_p01_jegyzokonyv_nez_1('464018');">         
                  <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
                     <tr><td class="FEKETE_TRANSPARENT_CL10" width="165"><b>«match.thirdReferee.name.toUpperCase»</b></td></tr>
                  </table>
                  </div>
                  
               </td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="4"></td>
               <td class="FEKETE_TRANSPARENT_CL10" width="65">szöv.ell.:</td>
               <td width="165"></td>
               <td width="10"></td> 
            </tr>
         </table>     
      </td>
   </tr>
</table>                      
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr>         
      <td class="URES_BARNA">
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td width="10"></td>
               <td class="FEHER_TRANSPARENT_CR11" width="50" height="15">forduló</td>
               <td width="4"></td>        
               <td class="URES_SZURKE" width="1"></td>
               <td width="4"></td>    
               <td class="FEHER_TRANSPARENT_CL11" width="120">szakág</td>                 
               <td class="URES_SZURKE" width="1"></td>  
               <td width="4"></td>    
               <td class="FEHER_TRANSPARENT_CL11" width="157">korosztály</td>                 
               <td class="URES_SZURKE" width="1"></td>  
               <td width="4"></td>    
               <td class="FEHER_TRANSPARENT_CL11" width="95">típus</td> 
               <td class="URES_SZURKE" width="1"></td>  
               <td width="4"></td>    
               <td class="FEHER_TRANSPARENT_CL11" width="95">évad</td> 
               <td class="URES_SZURKE" width="1"></td>  
               <td class="FEHER_TRANSPARENT_CR11" width="178">mérkõzés kódja</td>
               <td width="10"></td>
            </tr>
            <tr>
               <td width="10"></td>
               <td class="FEHER_TRANSPARENT_CR14" width="50" height="20"><b>13.</b></td>
               <td width="4"></td>        
               <td class="URES_SZURKE" width="1"></td>
               <td width="4"></td>    
               <td class="FEHER_TRANSPARENT_CL12" width="120"><b>férfi futsal</b></td>                 
               <td class="URES_SZURKE" width="1"></td>  
               <td width="4"></td>    
               <td class="FEHER_TRANSPARENT_CL12" width="157"><b>«match.ageGroup.name»</b></td>                 
               <td class="URES_SZURKE" width="1"></td>  
               <td width="4"></td>    
               <td class="FEHER_TRANSPARENT_CL12" width="95"><b>«match.type»</b></td> 
               <td class="URES_SZURKE" width="1"></td>  
               <td width="4"></td>    
               <td class="FEHER_TRANSPARENT_CL12" width="95"><b>«get_evad(match)»</b></td> 
               <td class="URES_SZURKE" width="1"></td>  
               <td class="FEHER_TRANSPARENT_CR12" width="178"><b>«match.id»</b></td>
               <td width="10"></td>
            </tr>
         </table>  
      </td>
   </tr>
</table>
<script language="JavaScript">
<!--
function jatekvezeto_nez_p01_jegyzokonyv_nez_1(be_01)
   { window.open('/pr01/p01_jatekvezeto_nez.asp?p_jvkod='+be_01,'JátékvezetõAdataitMegtekint','toolbar=0,location=0,directories=0,hotkeys=0,status=1,menubar=0,scrollbars=1,resizable=0,copyhistory=0,top=0,left=0,width=760,height=620'); }
-->
</script>

<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr>
      <td class="FEKETE_TRANSPARENT_CR09" width="20" height="15">mez</td>
      <td width="4"></td>
      <td class="URES_SZURKE" width="1"></td>
      <td width="5"></td>
      <td class="FEKETE_TRANSPARENT_CL10" width="100">név</td>
      <td class="BARNA_TRANSPARENT_CL11" width="169"><b>Kezdõ</b></td>
      <td class="URES_SZURKE" width="1"></td>
      <td class="FEKETE_TRANSPARENT_CR10" width="50">igazolás</td>
      <td width="9"></td>
      <td class="URES_BARNA" width="1"></td>
      <td width="10"></td>
      <td class="FEKETE_TRANSPARENT_CR09" width="20">mez</td>
      <td width="4"></td>
      <td class="URES_SZURKE" width="1"></td>
      <td width="5"></td>
      <td class="FEKETE_TRANSPARENT_CL10" width="100">név</td>
      <td class="BARNA_TRANSPARENT_CL11" width="169"><b>Kezdõ</b></td>
      <td class="URES_SZURKE" width="1"></td>
      <td class="FEKETE_TRANSPARENT_CR10" width="50">igazolás</td>
   </tr>         
</table>

<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr>
      <td width="350" valign="top">                  

«FOR player : match.home.startingLine»
«get_players(player)»
«ENDFOR»


      </td>
      <td width="9"></td>
      <td class="URES_BARNA" width="1"></td>
      <td width="10"></td>
      <td width="350" valign="top">

«FOR player : match.visitor.startingLine»
«get_players(player)»
«ENDFOR»
               
      </td>
   </tr>            
</table>
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr><td class="URES_BARNA" width="720" height="1"></td></tr>
</table>    
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr>
      <td class="FEKETE_TRANSPARENT_CR09" width="20" height="15">mez</td>
      <td width="4"></td>
      <td class="URES_SZURKE" width="1"></td>
      <td width="5"></td>
      <td class="FEKETE_TRANSPARENT_CL10" width="100">név <i>(idõ)</i></td>
      <td class="BARNA_TRANSPARENT_CL11" width="169"><b>Csere</b></td>
      <td class="URES_SZURKE" width="1"></td>
      <td class="FEKETE_TRANSPARENT_CR10" width="50">igazolás</td>
      <td width="9"></td>
      <td class="URES_BARNA" width="1"></td>
      <td width="10"></td>
      <td class="FEKETE_TRANSPARENT_CR09" width="20">mez</td>
      <td width="4"></td>
      <td class="URES_SZURKE" width="1"></td>
      <td width="5"></td>
      <td class="FEKETE_TRANSPARENT_CL10" width="100">név <i>(idõ)</i></td>
      <td class="BARNA_TRANSPARENT_CL11" width="169"><b>Csere</b></td>
      <td class="URES_SZURKE" width="1"></td>
      <td class="FEKETE_TRANSPARENT_CR10" width="50">igazolás</td>
   </tr>         
</table>  
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr>
      <td width="350" valign="top">                  

«FOR player : match.home.substitutes»
«get_players(player)»
«ENDFOR»

   
      </td>
      <td width="9"></td>
      <td class="URES_BARNA" width="1"></td>
      <td width="10"></td>
      <td width="350" valign="top">

«FOR player : match.visitor.substitutes»
«get_players(player)»
«ENDFOR»

      </td>
   </tr>            
</table>
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr><td class="URES_BARNA" width="720" height="1"></td></tr>
</table>
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr>
      <td class="FEKETE_TRANSPARENT_CL10" width="100">név</td>
      <td class="BARNA_TRANSPARENT_CL11" width="199"><b>Kispad</b></td>
      <td class="URES_SZURKE" width="1"></td>
      <td class="FEKETE_TRANSPARENT_CR10" width="50">igazolás</td>
      <td width="9"></td>
      <td class="URES_BARNA" width="1"></td>
      <td width="10"></td>
      <td class="FEKETE_TRANSPARENT_CL10" width="100">név</td>
      <td class="BARNA_TRANSPARENT_CL11" width="199"><b>Kispad</b></td>
      <td class="URES_SZURKE" width="1"></td>
      <td class="FEKETE_TRANSPARENT_CR10" width="50">igazolás</td>
   </tr>         
</table>
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr>
      <td width="350" valign="top">                  

«FOR stuffmember : match.home.staff»
«get_staffs(stuffmember)»
«ENDFOR»

      </td>
      <td width="9"></td>
      <td class="URES_BARNA" width="1"></td>
      <td width="10"></td>
      <td width="350" valign="top">

«FOR stuffmember : match.visitor.staff»
«get_staffs(stuffmember)»
«ENDFOR»

               
      </td>
   </tr>            
</table>
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr><td class="URES_BARNA" width="720" height="1"></td></tr>
</table>
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr>
      <td class="FEKETE_TRANSPARENT_CR10" width="20" height="15">idõ</td>
      <td width="4"></td>
      <td class="URES_SZURKE" width="1"></td>
      <td width="5"></td>
      <td class="FEKETE_TRANSPARENT_CL10" width="100">név</td>
      <td class="BARNA_TRANSPARENT_CL11" width="165"><b>Góllövõ</b></td>
      <td width="4"></td>
      <td class="URES_SZURKE" width="1"></td>
      <td class="FEKETE_TRANSPARENT_CR10" width="50">igazolás</td>
      <td width="9"></td>
      <td class="URES_BARNA" width="1"></td>
      <td width="10"></td>
      <td class="FEKETE_TRANSPARENT_CR10" width="20">idõ</td>
      <td width="4"></td>
      <td class="URES_SZURKE" width="1"></td>
      <td width="5"></td>
      <td class="FEKETE_TRANSPARENT_CL10" width="100">név</td>
      <td class="BARNA_TRANSPARENT_CL11" width="165"><b>Góllövõ</b></td>
      <td width="4"></td>
      <td class="URES_SZURKE" width="1"></td>
      <td class="FEKETE_TRANSPARENT_CR10" width="50">igazolás</td>
   </tr>         
</table>   
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr>
      <td width="350" valign="top">                  


«FOR goal : match.home.goals»
«get_goals(goal)»
«ENDFOR»
   
      </td>
      <td width="9"></td>
      <td class="URES_BARNA" width="1"></td>
      <td width="10"></td>
      <td width="350" valign="top">

«FOR goal : match.visitor.goals»
«get_goals(goal)»
«ENDFOR»
               
      </td>
   </tr>            
</table>
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr><td class="URES_BARNA" width="720" height="1"></td></tr>
</table>
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr>
      <td class="FEKETE_TRANSPARENT_CR10" width="20" height="15">idõ</td>
      <td width="4"></td>
      <td class="URES_SZURKE" width="1"></td>
      <td width="5"></td>
      <td class="FEKETE_TRANSPARENT_CL10" width="100">név</td>
      <td class="BARNA_TRANSPARENT_CL11" width="115"><b>Sárga-Piros lap</b></td>
      <td class="URES_SZURKE" width="1"></td>
      <td width="4"></td>
      <td class="FEKETE_TRANSPARENT_CL10" width="49">lap</td>
      <td class="URES_SZURKE" width="1"></td>
      <td class="FEKETE_TRANSPARENT_CR10" width="50">igazolás</td>
      <td width="9"></td>
      <td class="URES_BARNA" width="1"></td>
      <td width="10"></td>
      <td class="FEKETE_TRANSPARENT_CR10" width="20">idõ</td>
      <td width="4"></td>
      <td class="URES_SZURKE" width="1"></td>
      <td width="5"></td>
      <td class="FEKETE_TRANSPARENT_CL10" width="100">név</td>
      <td class="BARNA_TRANSPARENT_CL11" width="115"><b>Sárga-Piros lap</b></td>
      <td class="URES_SZURKE" width="1"></td>
      <td width="4"></td>
      <td class="FEKETE_TRANSPARENT_CL10" width="49">lap</td>
      <td class="URES_SZURKE" width="1"></td>
      <td class="FEKETE_TRANSPARENT_CR11" width="50">igazolás</td>
   </tr>         
</table>
<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
   <tr>
      <td width="350" valign="top">                  

«FOR card : match.home.cards»
«get_cards(card)»
«ENDFOR»

      </td>
      <td width="9"></td>
      <td class="URES_BARNA" width="1"></td>
      <td width="10"></td>
      <td width="350" valign="top">

«FOR card : match.visitor.cards»
«get_cards(card)»
«ENDFOR»

      </td>
   </tr>            
</table>
<script language="JavaScript"><!--
function jatekos_nez_p01_jegyzokonyv_nez_2(be_01)
   {window.open('/pr01/p01_jatekos_nez.asp?p_foverseny=1&p_verseny_id=9787&p_jnkod='+be_01,'JátékosAdataitMegtekint','toolbar=0,location=0,directories=0,hotkeys=0,status=1,menubar=0,scrollbars=1,resizable=1,copyhistory=0,top=0,left=0,width='+String(screen.availWidth-20)+',height='+String(screen.availHeight-60)); }
--></script>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_BARNA" width="700" height="1"></td></tr>
         </table>             
         
      </td>   
      <td width="10"></td>
   </tr>
</table>

<table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
<tr><td class="AACC10" width="720">0,7265625 seconds</td></tr>
</table>

   
      </td>
   </tr>            
</table>

</body>
</html>

	'''
}