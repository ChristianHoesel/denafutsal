package hu.bme.mit.inf.mdsd.reportgenerator.templates

import hu.bme.mit.inf.mdsd.reportgenerator.helper.GeneratorHelper;
import model.Match;

class MatchGenerator {
	def generateDataModel(Match dataModel) {
		System::out.println("code generation for " + dataModel.eResource.URI)
//		for(clazz : dataModel.events) {
//			System::out.println(clazz.toString + " " + clazz.committer.name)
//			GeneratorHelper::createHTMLFile(
//				dataModel.eResource,
//				clazz.committer.name,
//				true,
//				clazz.compile)
//		}
		
		System::out.println(compile(dataModel));
		get_results_of_first_half(dataModel);
		GeneratorHelper::createHTMLFile(dataModel.eResource, dataModel.id.toString, true, dataModel.compile);
		
	}
	
	def get_results_of_first_half(Match match) {
		for(e : match.events) {
			if (e.type.toString.equals("Goal")) {
				System::out.println(e.time)
				System::out.println(e.type)
			}
		}
	}
		
	
	def compile(Match match) '''
<html>
<head>
<meta http-equiv="cache-control" content="no-cache" />
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
<meta name="verify-v1" content="NbcFoFDQeCFhmcD57l4QmYh9w3z0nCGSetVfJgIUDnI=" />
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
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" background="/images/hatter/eredmeny_72x36.jpg">
            <tr>
               <td>
                  <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
                  
                     <tr><td class="FEKETE_TRANSPARENT_CC18" width="72" height="21"><b>2 - 2</b></td></tr>
                     <tr><td class="FEKETE_TRANSPARENT_CC11" width="72" height="14"><b>1 - 2</b></td></tr>
 

                  </table>
               </td>
            </tr>
         </table>
      </td>
      <td class="FEKETE_TRANSPARENT_CC14" width="314">
         <b>
         MAFC
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
                     <tr><td class="FEKETE_TRANSPARENT_CL10" width="165"><b>CSIRKE RUDOLF </b></td></tr>
                  </table>
                  </div>
                  
               </td> 
               <td class="URES_SZURKE" width="1"></td>
               <td width="4"></td>
               <td class="FEKETE_TRANSPARENT_CL10" width="65">asszisztens:</td>
               <td width="165">
                  
                  <div class="MOff" style="cursor: pointer;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekvezeto_nez_p01_jegyzokonyv_nez_1('349602');">         
                  <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
                     <tr><td class="FEKETE_TRANSPARENT_CL10" width="165"><b>CZINDER IMRE </b></td></tr>
                  </table>
                  </div>
                  
               </td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="4"></td>
               <td class="FEKETE_TRANSPARENT_CL10" width="65">ellenõr:</td>
               <td width="165">
                  
                  <div class="MOff" style="cursor: pointer;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';">         
                  <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
                     <tr><td class="FEKETE_TRANSPARENT_CL10" width="165"></td></tr>
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
                     <tr><td class="FEKETE_TRANSPARENT_CL10" width="165"><b>HORVÁTH ZOLTÁN (A) </b></td></tr>
                  </table>
                  </div>
                  
               </td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="4"></td>
               <td class="FEKETE_TRANSPARENT_CL10" width="65">szöv.ell.:</td>
               <td width="165">
                  
               </td>
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
               <td class="FEHER_TRANSPARENT_CL12" width="157"><b>felnõtt</b></td>                 
               <td class="URES_SZURKE" width="1"></td>  
               <td width="4"></td>    
               <td class="FEHER_TRANSPARENT_CL12" width="95"><b>bajnoki</b></td> 
               <td class="URES_SZURKE" width="1"></td>  
               <td width="4"></td>    
               <td class="FEHER_TRANSPARENT_CL12" width="95"><b>2012/2013</b></td> 
               <td class="URES_SZURKE" width="1"></td>  
               <td class="FEHER_TRANSPARENT_CR12" width="178"><b>643017</b></td>
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
</script><table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
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

         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('122398');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>                        
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">1</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">KASZA VIKTOR</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">122398</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('121564');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>                        
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">10</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">BÉNYI KÁLMÁN</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">121564</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('237310');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>                        
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">9</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">TAR TAMÁS</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">237310</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('136774');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>                        
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">7</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">HAZUGA SOMA</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">136774</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('121510');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>                        
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">6</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">SZABADFI PÉTER</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">121510</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
      </td>
      <td width="9"></td>
      <td class="URES_BARNA" width="1"></td>
      <td width="10"></td>
      <td width="350" valign="top">

         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('440245');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">1</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">DR.VARRÓ DÁNIEL</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">440245</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('193384');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">19</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">CSERNAI GÁBOR LÁSZLÓ</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">193384</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('138119');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">2</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">ÖREGLAKI NORBERT</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">138119</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('134877');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">5</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">SIVÁK PÉTER</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">134877</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('154010');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">3</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">SZABÓ ZOLTÁN</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">154010</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
               
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

         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('207670');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">12</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">SÁRDI MÁTÉ</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">207670</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('129254');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">3</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">PÁLFI RÓBERT</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">129254</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('121596');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">16</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">FINTA PÉTER</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">121596</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('249626');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">8</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">BAKAY FERENC</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">249626</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('110456');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">14</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">VAS FERENC</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">110456</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('130374');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">15</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">MAROSVÖLGYI TAMÁS</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">130374</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('286858');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">13</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">WEISZ ZOLTÁN</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">286858</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
      </td>
      <td width="9"></td>
      <td class="URES_BARNA" width="1"></td>
      <td width="10"></td>
      <td width="350" valign="top">

         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('186443');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">4</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">ANDORKA KRISTÓF</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">186443</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('201975');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">18</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">RAJNAY GÁBOR</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">201975</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('130991');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">9</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">KERTÉSZ GERGÕ</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">130991</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('286244');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">10</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">MUNKÁCSI RICHÁRD</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">286244</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('120916');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">8</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">FRITZ BALÁZS</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">120916</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('469799');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CR11" width="20" height="15">66</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="269">PAPP ENDRE LEVENTE</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">469799</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
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

         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>                        
               <td class="FEKETE_TRANSPARENT_CL11" width="215" height="15">NÉMETH GÁBOR</td>
               <td class="FEKETE_TRANSPARENT_CL09" width="84">vezetõedzõ</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">142095</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>                        
               <td class="FEKETE_TRANSPARENT_CL11" width="215" height="15">TÓTH GÁBOR</td>
               <td class="FEKETE_TRANSPARENT_CL09" width="84">edzõ</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">396165</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>                        
               <td class="FEKETE_TRANSPARENT_CL11" width="215" height="15">GÖRGICS KÁLMÁN</td>
               <td class="FEKETE_TRANSPARENT_CL09" width="84">gyúró</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">113395</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>                        
               <td class="FEKETE_TRANSPARENT_CL11" width="215" height="15">RAJKI TAMÁS</td>
               <td class="FEKETE_TRANSPARENT_CL09" width="84">egyéb</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">322932</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
      </td>
      <td width="9"></td>
      <td class="URES_BARNA" width="1"></td>
      <td width="10"></td>
      <td width="350" valign="top">

         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CL11" width="215" height="15">KÕRÖSI ZOLTÁN</td>
               <td class="FEKETE_TRANSPARENT_CL09" width="84">vezetõedzõ</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">170267</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="FEKETE_TRANSPARENT_CL11" width="215" height="15">TIHANYI MIKLÓS</td>
               <td class="FEKETE_TRANSPARENT_CL09" width="84">gyúró</td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">347473</td>
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
               
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

         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('121596');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>                        
               <td class="ASCR10" width="20" height="15">16'</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="265">
                  FINTA PÉTER
               </td>     
               <td class="FEKETE_TRANSPARENT_CL10" width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">121596</td> 
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('129254');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>                        
               <td class="ASCR10" width="20" height="15">35'</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="265">
                  PÁLFI RÓBERT
               </td>     
               <td class="FEKETE_TRANSPARENT_CL10" width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">129254</td> 
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
      </td>
      <td width="9"></td>
      <td class="URES_BARNA" width="1"></td>
      <td width="10"></td>
      <td width="350" valign="top">

         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('138119');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="ASCR10" width="20" height="15">3'</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="265">
                  ÖREGLAKI NORBERT
               </td>     
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">138119</td> 
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
   
         <div class="MOff" style="cursor: pointer; width: 350;" onMouseOut="this.className='MOff';" onmouseover="this.className='MOn_1';" OnClick="jatekos_nez_p01_jegyzokonyv_nez_2('138119');">          
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr>
               <td class="ASCR10" width="20" height="15">12'</td>
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td width="5"></td>
               <td class="FEKETE_TRANSPARENT_CL11" width="265">
                  ÖREGLAKI NORBERT
               </td>     
               <td width="4"></td>
               <td class="URES_SZURKE" width="1"></td>
               <td class="FEKETE_TRANSPARENT_CR11" width="50">138119</td> 
            </tr>
         </table>
         </div>
         <table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse">
            <tr><td class="URES_SZURKE" width="350" height="1"></td></tr>
         </table>
               
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

      </td>
      <td width="9"></td>
      <td class="URES_BARNA" width="1"></td>
      <td width="10"></td>
      <td width="350" valign="top">
            
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
</body>
</html>

	'''
}