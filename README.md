# prototypePattern

Ce presupune:
- clonarea unui obiect deja existent si modificarea lui  in locul crearii unuia nou

Cand sa folosim prototype:
- cand vrem sa cream mai multe obiecte de acelasi tip insa cu mici modificari
- cand vrem sa reducem costurile de creare a unui obiect nou, in 
special in cazul obiectelor mari pentru care instantierea unuia nou ar fi costisitoare pt aplicatie
- cand crearea unui nou obiect ar necesita un timp destul de mare sau ar fi un proces prea complicat


Avantaje:
- reduce nevoia de a crea clase aditionale ca in cazul factory pattern
- ascunde complexitatea crearii unui obiect
- permite adaugarea si stergerea obiectelor la runtime



Cum se foloseste :
- obiectul nou creat va fi o clona a obiectului de baza cu cateva modificari
- obiectul de baza va implementa interfata clonable si va rescrie metoda clone.
- metoda clone ca crea o copie a obiectului original intr-un nou obiect care va putea fi modificat ulterior

Probleme: shallow cloning and deep cloning
- shallow cloning copie doar la suprafata obiectul - de exemplu, daca avem un obiect cu o referinta catre alt obiect, 
	atunci clona lui va trimite catre aceeasi instanta a obiectului referinta. Atat obiectul de baza cat si copia au aceeasi  instanta a obiectului referinta.
Problema intervine atunci cand vrem sa modificam proprietatile referintei unui obiect..Observam ca ambele obiecte vor suferi modificari.
- deep cloning - rezolva problema de mai sus.. Fiecare obiect va face trimitere catre o referinta diferita . In acest caz, daca modificam proprietatile referintei unui obiect, celalalt va ramane neschimbat. Fiecare obiect va avea o instanta diferita a acelui obiect de referinta.
