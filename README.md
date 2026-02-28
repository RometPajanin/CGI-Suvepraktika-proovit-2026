CGI suvepraktikale kandideerimise ülesanne
Nutikas Restorani Reserveerimissüsteem

Ülesandeks on luua restoranikülastajale laudade broneerimise ja sobiva laua soovitamise
veebirakendus.
Külastaja soovib broneerida lauda kindlaks kellaajaks ning peab saama rakendada erinevaid
filtreid, mille alusel talle vabu aegu ja laudu soovitatakse. Lisaks peab rakendus soovitama
kliendile parimat võimalikku lauda, võttes arvesse seltskonna suurust ja kliendi eelistusi (nt
privaatsus, aknakoht, ligipääsetavus).
Laua soovitamine ja valimine peab toimuma restorani saali plaanil. Juba broneeritud lauad
tuleks genereerida juhuslikult.
Tehnoloogiad

Ülesande lahendamiseks ei ole ette nähtud kindlat front-end raamistikku. Rakenduse back-
endis tuleks kasutada Spring Boot'i ning viimast Java LTS versiooni. Tuleb kasutada

versioonikontrolli (Git).
Lahenduse etapid
1. Broneeringu otsing ja filtreerimine Kasutaja peaks alguses nägema restorani saaliplaani või
ajakava. Kasutaja peab saama otsingut filtreerida. Näited filtritest (nimekiri ei ole lõplik):
• Kuupäev ja kellaaeg
• Inimeste arv (seltskonna suurus)
• Tsoon (nt terrass, sisesaal, privaatruum)
2. Laua soovitamine ja paigutuse loogika Kui kellaaeg ja inimeste arv on valitud, peab
rakendus soovitama kliendile sobivaima laua(d). Soovitused tuleks kuvada restorani plaanil.
Algoritm peaks püüdma laudu täita efektiivselt, kuid arvestama kliendi soove.
• Efektiivsus: 2-liikmelist seltskonda ei ole mõistlik paigutada 8-kohalisse lauda, kui
saadaval on 2-kohaline laud.
• Eelistused: Võimalus valida eelistusi nagu "Vaikne nurk / Privaatsus", "Akna all", "Laste
mängunurga lähedal".
Soovituse loogika on vabalt valitav. Näiteks võib vabadele laudadele omistada skoori, mis
põhineb sellel, kui hästi laud vastab seltskonna suurusele (et ei jääks liiga palju tühje toole) ja
kliendi eelistustele.
3. Visuaalne plaan Restorani suuruse ja laudade paigutuse võib vabalt valida (võib olla lihtne
ruudustik või vabalt paigutatud objektid).
• Hõivatud lauad peavad olema visuaalselt eristatavad.
• Soovitatud laud peaks olema esile tõstetud.

"Kui aega jääb üle"
Kui tunned, et tahaksid teha midagi veel, et sinu töö eriliselt silma paistaks, on siin mõned ideed
(kuid sinu fantaasia on piiriks)
• Dünaamiline laudade liitmine: Kui suurt seltskonda (nt 10 inimest) ei saa paigutada
ühte lauda, soovitab süsteem kahte kõrvuti asuvat lauda, mida saab kokku lükata.
• Arvesta keskmise külastuse ajaga: 2-3h möödudes võiks eeldada, et konkreetne laud
on uuesti broneeringuteks saadaval.
• Admin vaade: Lihtne liides restorani omanikule, kus ta saab hiirega lohistades laudade
paigutust muuta.
• Väline API: Integreeri rakendus mõne avaliku retsepti- või toiduandmebaasiga (nt
TheMealDB), et broneeringu juurde saaks soovitada ka päevapraadi.
• Testid ja Docker: Lisa rakendusele automaattestid ja paiguta rakendus Dockeri
konteinerisse.
Dokumentatsioon
Meie poolt hindab ja käivitab lahendust inimene, kes pole varem seda arendusprojekti näinud.
Tal peaks olema lihtne rakendust käivitada, samuti võiks dokumenteerida, mida ja kuidas tegid.
Pane kirja tööks kulunud aeg ja tee märkmeid selle kohta, mis oli keeruline. Kui jäid mõne
probleemi lahendamise puhul jänni, pane kirja, kust said abi ja kuidas probleemi lahendasid. Kui
mõni probleem jääb koodis lahendamata, siis kirjelda, kuidas sinu arvates seda võiks
lahendada. Kui ülesande püstituses on sinu jaoks mitmeti mõistetavusi, siis märgi ära eeldused,
mida oled ülesande lahendamisel teinud.
Soovituslik on koodi committida pigem varem ja tihemini, mis annab samuti aimu, kuidas aja
jooksul lahenduse valmimiseni jõudsid.
Juhul, kui kasutad lahenduses näidisprojektidest, internetist, Stackoverflow’st või AI
tööriistadega genereeritud pikemaid koodijuppe, palun viita neile dokumentatsioonis ja
kommentaaridega koodis, et oleks võimalik aru saada, milline oli sinu panus.
Proovitöös hindame ülesande sisulist ja tehnilist teostust ning lahenduse dokumenteerimist.
Saada lahendus tagasi ka siis, kui ei jõudnud kõike ära teha või see pole sinu arvates veel
laitmatu. Kui otsustad lahendust mitte saata, anna ka sellest meile teada, et teaksime sellega
arvestada.
Lahenduse esitamine
Ülesande esitamiseks tuleb kasutada avalikku koodihoidlat – näiteks Github, Bitbucket, tagasi
tuleb saata lahendusele viitav link



Selle restorani broneerimissüsteemi arendamisel jälgime tööstusharu standardeid ja parimaid praktikaid, et tagada koodi kõrge kvaliteet, loetavus ja hooldatavus. Kogu kirjutatav kood peab lähtuma järgmistest printsiipidest:

SOLID Printsiibid: Koodi struktuur peab toetuma objektorienteeritud disaini alustaladele. Igal klassil tohib olla ainult üks selge vastutus (Single Responsibility) – näiteks laua soovituse algoritm ja andmebaasi salvestamine ei tohi asuda samas meetodis.

KISS (Keep It Simple, Stupid): Fookus on lihtsusel ja selgusel. Väldime enneaegset optimeerimist ja üle-konstrueerimist (over-engineering). Kood peab olema loogiline, isedokumenteeriv ning teistele kergelt loetav.

DRY (Don't Repeat Yourself): Väldime koodi dubleerimist. Kui sama loogika (näiteks kuupäevade valideerimine) kordub mitmes kohas, tuleb see tõsta eraldi abiklassi (utility) või jagatud teenusesse.

Sõltuvuste süstimine (Dependency Injection - DI): Komponentide vaheline sidusus peab olema nõrk (loose coupling). Kasutame Springi IoC (Inversion of Control) konteinerit, eelistades klassides konstruktoripõhist süstimist (Constructor Injection), mis muudab koodi turvalisemaks ja ühiktestide (unit tests) kirjutamise oluliselt lihtsamaks.

RESTful API Disain: Backend peab pakkuma puhast REST API-t. Otspunktide (endpoints) nimed peavad tähistama ressursse mitmuses (nt /api/tables, /api/bookings, mitte /api/getTables), ning tegevuse iseloomu määravad õiged HTTP meetodid (GET andmete küsimiseks, POST uue broneeringu loomiseks jne).

Range Kihiline Arhitektuur (Separation of Concerns): Jälgime rangelt kihtide eraldatust.

Controller vastutab ainult HTTP päringute vastuvõtmise ja vastuste tagastamise eest.

Service sisaldab kogu rakenduse äriloogikat (nt vabade laudade leidmine ja soovitamine).

Repository suhtleb ainult andmebaasiga.

YAGNI (You Aren't Gonna Need It): Koodi kirjutatakse ainult nende funktsionaalsuste jaoks, mida ülesande püstitus hetkel otseselt nõuab. Me ei loo keerulisi süsteeme "igaks juhuks" tuleviku tarbeks.

Interface names should start with an "I".
If used than enums should start with an "E"