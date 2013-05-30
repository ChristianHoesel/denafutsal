package hu.bme.mit.inf.mdsd.reportgenerator.templates

import hu.bme.mit.inf.mdsd.reportgenerator.helper.GeneratorHelper
import hu.bme.mit.inf.mdsd.reportgenerator.helper.WordUtils
import model.Match
import model.Player
import model.Position
import model.StaffMember
import model.Event
import model.EventType

class MatchTexGenerator {
	
	
    def generate(Match dataModel, String filename) {
    	GeneratorHelper::createTex(filename, dataModel.compileTex); 
    }
    
    
def compileTex(Match match) '''
\documentclass[a4paper]{article}
\pagestyle{headings}
\usepackage{array}
\usepackage[screen,paneltoc,code]{pdfscreen}
\usepackage{longtable, tabularx, tabu}
\usepackage[margin=0.5in]{geometry}
\usepackage[english]{babel}
\usepackage[utf8]{inputenc}
\usepackage{color}
\author{Futsalgen}
\marginparsep = 0pt
\begin{document}
�match.title�
�line�
�match.teamsAndScore�
�line�
�match.referees�
�line�
�match.data�
�match.players�
�match.staff�
�match.goals�
�match.cards�
\end{document}
'''
def cards(Match match) 
'''

\hspace{-0.65cm}
\begin{tabular}{ p{0.6cm} p{4.4cm} p{0.5cm}  p{2cm} | p{0.6cm} p{4.4cm}  p{0.5cm}  p{2cm}  }
no. & n�v \hfill \textbf{S�rga-Piros lap} \hfill \vphantom a & lap & azonos�t� & no. & n�v \hfill \textbf{S�rga-Piros lap} \hfill \vphantom a & lap & azonos�t� \\ \hline
\tabularnewline
�if(match.home.cards.size > match.visitor.cards.size) match.cardDefs(match.home.cards.size-1)�
�if(match.home.cards.size < match.visitor.cards.size) match.cardDefs(match.visitor.cards.size-1)�
�if(match.home.cards.size == match.visitor.cards.size) match.cardDefs(match.visitor.cards.size-1)�
\tabularnewline
\hline
\end{tabular}
'''

def goals(Match match) 
'''

\hspace{-0.65cm}
\begin{tabular}{ p{0.6cm} p{5.3cm}  p{2cm} | p{0.6cm} p{5.3cm}  p{2cm}  }
no. & n�v \hfill \textbf{G�ll�v�k} \hfill \vphantom a & azonos�t� & no. & n�v \hfill \textbf{G�ll�v�k} \hfill \vphantom a & azonos�t� \\ \hline
\tabularnewline
�if(match.home.goals.size > match.visitor.goals.size) match.goalDefs(match.home.goals.size-1)�
�if(match.home.goals.size < match.visitor.goals.size) match.goalDefs(match.visitor.goals.size-1)�
�if(match.home.goals.size == match.visitor.goals.size) match.goalDefs(match.visitor.goals.size-1)�
\tabularnewline
\hline
\end{tabular}
'''

def staff(Match match) 
'''

\hspace{-0.65cm}
\begin{tabular}{  p{6.32cm}  p{2cm} | p{6.32cm}  p{2cm}  }
n�v \hfill \textbf{Kispad} \hfill \vphantom a & azonos�t� &  n�v \hfill \textbf{Kispad} \hfill \vphantom a & azonos�t� \\ \hline
\tabularnewline
�if(match.home.staff.size > match.visitor.staff.size) match.staffDefs(match.home.staff.size-1)�
�if(match.home.staff.size < match.visitor.staff.size) match.staffDefs(match.visitor.staff.size-1)�
�if(match.home.staff.size == match.visitor.staff.size) match.staffDefs(match.visitor.staff.size-1)�
\tabularnewline
\hline
\end{tabular}'''

def teamsAndScore(Match match) 
'''
\begin{tabular}{>{\centering\arraybackslash}p{7.5cm} >{\centering\arraybackslash}p{2cm} >{\centering\arraybackslash}p{7.5cm}}
\huge �match.home.name.toUpperCase� & \LARGE �match.home.goalCount�-�match.visitor.goalCount� & \huge �match.visitor.name.toUpperCase� \\
 & \normalsize �match.home.goalCountHT�-�match.visitor.goalCountHT� &
\end{tabular}
'''

def title(Match match) '''
\begin{flushleft}
Futsal\hfill Magyar Labdar�g� Sz�vets�g\\
�match.date�\hfill �match.location�\\
\end{flushleft}
'''

def line() '''
\begin{center}
\line(1,0){520 }
\end{center}
'''

def referees(Match match) '''
\begin{tabbing}
jatekvezet�: \textbf{�match.referee.name.capitalize�} \hspace{25 mm}  asszisztens: \= \textbf{�match.assistant.name.capitalize�} \hspace{25 mm} ellen�r: \textbf{�match.supervisor.name.capitalize�} \\
tartjv.: \> \textbf{�match.thirdReferee.name.capitalize�}
\end{tabbing}
'''

def data(Match match) '''
\begin{tabbing}
\\
\\
fordul� \hspace{15 mm} \= szak�g  \hspace{25 mm} \= koroszt�ly  \hspace{15 mm} \= t�pus  \hspace{20 mm} \= �vad  \hspace{20 mm} \= m�rk�z�s k�dja \\
\hphantom a \> \hphantom a \> \textbf{�match.ageGroup�} \> \textbf{�match.type�}  \> \hphantom a  \> \textbf{�match.id�} 
\end{tabbing}
'''

def players(Match match) '''
\begin{tabular}{ p{0.6cm} p{5.3cm}  p{2cm} | p{0.6cm} p{5.3cm}  p{2cm}  }
\hline
no. & n�v \hfill \textbf{Kezd�} \hfill \vphantom a & azonos�t� & no. & n�v \hfill \textbf{Kezd�} \hfill \vphantom a & azonos�t� \\ \hline
\tabularnewline
�match.startDefs�
\tabularnewline
\hline
no. & n�v \hfill \textbf{Csere} \hfill \vphantom a & azonos�t� & no. & n�v \hfill \textbf{Csere} \hfill \vphantom a & azonos�t� \\ \hline
\tabularnewline
�if(match.home.substitutes.size > match.visitor.substitutes.size) match.subDefs(match.home.substitutes.size-1)�
�if(match.home.substitutes.size < match.visitor.substitutes.size) match.subDefs(match.visitor.substitutes.size-1)�
�if(match.home.substitutes.size == match.visitor.substitutes.size) match.subDefs(match.visitor.substitutes.size-1)�
\tabularnewline
\hline
\end{tabular}
'''
def startDefs(Match match) 
'''
�FOR Integer i: 0..4�
�match.home.startingLine.get(i).fullData(match.home.captain)�
�and�
�match.visitor.startingLine.get(i).fullData(match.visitor.captain)�
�newLine�
�ENDFOR�
'''
def subDefs(Match match, int count)
'''
�FOR Integer i: 0..count�
�if(match.home.substitutes.size > i) match.home.substitutes.get(i).fullData(match.home.captain)
 else{ and and }�
�and�
�if(match.visitor.substitutes.size > i) match.visitor.substitutes.get(i).fullData(match.visitor.captain)
 else{ and and }�
�newLine�
�ENDFOR�
'''

def staffDefs(Match match, int count)
'''
�FOR Integer i: 0..count�
�if(match.home.staff.size > i) match.home.staff.get(i).fullData()
 else{ and }�
�and�
�if(match.visitor.staff.size > i) match.visitor.staff.get(i).fullData()
 else{ and }�
�newLine�
�ENDFOR�
'''

def goalDefs(Match match, int count)
'''
�FOR Integer i: 0..count�
�if(match.home.goals.size > i) match.home.goals.get(i).goalData()
 else{ and }�
�and�
�if(match.visitor.goals.size > i) match.visitor.goals.get(i).goalData()
 else{ and }�
�newLine�
�ENDFOR�
'''

def cardDefs(Match match, int count)
'''
�FOR Integer i: 0..count�
�if(match.home.cards.size > i) match.home.cards.get(i).cardData()
 else{ ''' & & & ''' }�
�and�
�if(match.visitor.cards.size > i) match.visitor.cards.get(i).cardData()
 else{ ''' & & & ''' }�
�newLine�
�ENDFOR�
'''

def cardData(Event event) 
'''�event.checkShirt� & �event.committer.name.capitalize� & �event.decideColor� & �event.committer.id�'''
	
def decideColor(Event event) {
	if(event.type == EventType::YELLOW_CARD)
		return ''' \colorbox{yellow}{s�rga} '''		
	return ''' \colorbox{red}{piros} '''
}


def checkShirt(Event event) {
	if(event.committer.playerRole != null)
		return	event.committer.playerRole.shirtNo.toString;
	return "";
}



def goalData(Event event)
''' �event.committer.playerRole.shirtNo� & �event.committer.name.capitalize� & �event.committer.id� '''


def fullData(StaffMember member) 
'''�member.teamMember.name.capitalize� \hfill �member.role.toString.toLowerCase� & �member.teamMember.id�'''

def newLine() '''\\'''

def and() ''' & '''

def gk() '''(gk)'''

def cpt() '''(cpt)'''

def fullData(Player player, Player captain) '''
�player.shirtNo� & �player.teamMember.name.capitalize� �if(player.position == Position::GOALKEEPER) gk� �if(player.equals(captain)) cpt� & �player.teamMember.id�
'''

def capitalize(String content) '''�WordUtils::capitalizeFully(content, '.'.charAt(0), ' '.charAt(0))�'''

}
