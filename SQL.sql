-- Liste des fournisseurs qui ont au moins 2 commandes
	- SELECT * FROM `fournisseurs` f INNER JOIN acheter A ON A.ID_FOUR = f.id 
		GROUP BY f.id HAVING COUNT(A.ID_FOUR) >=2

	- SELECT * FROM `fournisseurs` f INNER JOIN (SELECT COUNT(*) count, ID_FOUR FROM acheter 
	GROUP BY ID_FOUR) as A ON A.ID_FOUR = f.id WHERE A.count >=2

	- SELECT * FROM acheter a INNER JOIN fournisseurs f ON f.id = a.ID_FOUR GROUP BY a.ID_FOUR 
	HAVING COUNT(a.ID_FOUR) >= 2

-- List des fournisseurs qui n'ont pas de commande
	- SELECT * FROM fournisseurs f LEFT JOIN acheter a ON a.ID_FOUR = f.id WHERE a.ID_FOUR IS NULL

-- List des fournisseurs qui n'ont jamais acheté de fraises
	- SELECT * FROM fournisseurs f LEFT JOIN acheter a ON a.ID_FOUR = f.id INNER JOIN produits p 
	ON p.id = a.ID_PROD WHERE p.LIBELLE != "Fraises" GROUP BY f.id

-- Liste des fournisseurs qui n'ont deja fait les achats de plus 20
	- SELECT *, SUM(a.PRIXACHAT) FROM fournisseurs f INNER JOIN acheter a ON a.ID_FOUR = f.id 
	GROUP BY f.id  HAVING SUM(a.PRIXACHAT) > 20
	
-- Liste des fournisseur par odre croissant du taux d'achat
	- SELECT f.id, f.nom, SUM(a.PRIXACHAT) AS total_achat
FROM fournisseurs f
LEFT JOIN acheter a ON a.ID_FOUR = f.id
GROUP BY f.id, f.nom
ORDER BY total_achat ASC;


-- liste le nombre de produits par fournisseur, ne pas afficher les fournisseurs sans produits

SELECT COUNT(p.id), f.NOM FROM produits p INNER JOIN fournisseurs f ON f.id = p.ID_FOUR GROUP BY f.id HAVING COUNT(p.id) > 0


-------------------
SELECT first_name, last_name,round(avg(score),2) avg_score
	FROM students WHERE students.TEST_NAME IN ('English Test', 'History Test')
	group by first_name,last_name
	having avg(score)>=0.9
	order by avg(score) desc