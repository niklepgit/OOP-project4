Λεπιδας Νικολαος
sdi1600090

Περιβαλλον αναπτυξης: Η ασκηση αναπτυχθηκε σε περιβαλλον linux (kali) και εχει δοκιμαστει επισης σε linux. Εχω φτιαξει ενα bash script με ονομα makefile που τρεχει ετσι: ./makefile και ουσιαστικα εχει την εντολη του compilation: javac main.java artifacts.java masterpiece.java paintings.java sculptures.java

Τροπος εκτελεσης: Αρχικα για αν τρεξει το προγραμμα παιρνει 3 ορισματα απο τη γραμμη εντολων, πρωτο τον αριθμο των artifacts, δευτερο τον movement και τριτο το condition (εχω φτιαξει να δουλευει και χωρις να δεχεται καποιο condition).
παραδειγμα: java main 10 expressionism good

Δεν εχω ορισει καμια κλαση abstract. Το προγραμμα τρεχει κανονικα και οι συναρτησεις evaluate μπορουν να μην παρουν ως ορισμα το condition οπως λεει και η εκφωνηση. Για να πετυχω να υπαρχει default argument στις συναρτησεις evalutate απλα τις εκανα overload.
Εχω φτιαξει μια συναρτηση createArrayOfArtifacts οπου φτιαχνω τον πινακα με τα τυχαια artifacts.