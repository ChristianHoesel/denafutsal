denafutsal
==========

What is it?
-----------

It's a futsal match contoller and report generator application. It was developed as a homework for Model Driven Software Development course at BUTE (http://www.inf.mit.bme.hu/en).

Used technologies
-----------------

* Yakindu
* Xtend for report generating
* EMF IncQuery for modeling and validation (http://viatra.inf.mit.bme.hu/incquery)

How can you use it?
-------------------

1. Checkout the subprojects to your Eclipse workspace.
2. Open the hu.bme.mit.inf.mdsd.1.model/model/model.ecore file and click on the generate all line in right click menu.
3. Add to the build path of the project hu.bme.mit.inf.mdsd.one.rest the jersey-bundle-1.17.jar.
4. Run the hu.bme.mit.inf.mdsd.one.app project as an Eclipse application.
5. Fill the required fields.
6. Click to the start first half button to start the match. Then you can add goals, cards, etc.
7. At the end of the match you can generate the match report to HTML or TeX. (You can find upload and download menu items in the Report menu, but it doesn't work without a 3rd party webservice, which wasn't public yet)

Roadmap
-------

Fork it, there are a lot of todos ang bugs, especially on the UI. ;) 
