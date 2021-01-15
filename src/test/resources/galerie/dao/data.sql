-- Initialisation spécifiques pour un jeu de test
--INSERT INTO Galerie(nom, adresse) VALUES ('Saatchi', 'King\''s Road, Londres');
INSERT INTO Tableau(titre, support, largeur, hauteur) VALUES ('Le Cri', 'Toile', 100, 120);
INSERT INTO Personne(DTYPE, nom, adresse) VALUES ('Client', 'Alex', 'Lacrouzette');
INSERT INTO Exposition(debut, intitule, duree) VALUES ('2021-01-01', 'Expo Coucou', 2);
INSERT INTO Achat(vendu_le, prix_vente, exposition_id) VALUES ('2021-01-02', 1250.50, 1);
-- Initialisation des tables intermédiaires
--INSERT INTO Personne_Tableaux(artiste_id, tableaux_id) VALUES (1,1);
--INSERT INTO Personne_Transactions(artiste_id, transactions_id) VALUES (1,1);
--INSERT INTO Expo_Tableau(exposition_id, tableau_id) VALUES (1,1);