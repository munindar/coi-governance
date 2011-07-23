Boilerplate Goes Here
SELECT 'Inconsistent-Message' FROM Seller.quote t2 WHERE ((':Seller.rfq.ID' = t2.ID) AND (':Seller.rfq.item' <> t2.item)) UNION SELECT 'Inconsistent-Message' FROM Seller.accept t5 WHERE ((':Seller.rfq.ID' = t5.ID) AND (':Seller.rfq.item' <> t5.item)) UNION SELECT 'Inconsistent-Message' FROM Seller.reject t7 WHERE ((':Seller.rfq.ID' = t7.ID) AND (':Seller.rfq.item' <> t7.item)) UNION SELECT 'Inconsistent-Message' FROM Seller.ship t8 WHERE ((':Seller.rfq.ID' = t8.ID) AND (':Seller.rfq.item' <> t8.item));
SELECT 'Inconsistent-Message' FROM Seller.rfq t1 WHERE ((':Seller.quote.ID' = t1.ID) AND (':Seller.quote.item' <> t1.item)) UNION SELECT 'Inconsistent-Message' FROM Seller.accept t5 WHERE ((':Seller.quote.ID' = t5.ID) AND ((':Seller.quote.item' <> t5.item) OR (':Seller.quote.price' <> t5.price))) UNION SELECT 'Inconsistent-Message' FROM Seller.reject t7 WHERE ((':Seller.quote.ID' = t7.ID) AND ((':Seller.quote.item' <> t7.item) OR (':Seller.quote.price' <> t7.price))) UNION SELECT 'Inconsistent-Message' FROM Seller.ship t8 WHERE ((':Seller.quote.ID' = t8.ID) AND (':Seller.quote.item' <> t8.item));
SELECT 'Inconsistent-Message' FROM Seller.rfq t1 WHERE ((':Seller.accept.ID' = t1.ID) AND (':Seller.accept.item' <> t1.item)) UNION SELECT 'Inconsistent-Message' FROM Seller.quote t2 WHERE ((':Seller.accept.ID' = t2.ID) AND ((':Seller.accept.item' <> t2.item) OR (':Seller.accept.price' <> t2.price))) UNION SELECT 'Inconsistent-Message' FROM Seller.reject t7 WHERE ((':Seller.accept.ID' = t7.ID) AND ((':Seller.accept.item' <> t7.item) OR (':Seller.accept.price' <> t7.price) OR (':Seller.accept.response' <> t7.response))) UNION SELECT 'Inconsistent-Message' FROM Seller.ship t8 WHERE ((':Seller.accept.ID' = t8.ID) AND ((':Seller.accept.item' <> t8.item) OR (':Seller.accept.address' <> t8.address)));
SELECT 'Inconsistent-Message' FROM Seller.rfq t1 WHERE ((':Seller.reject.ID' = t1.ID) AND (':Seller.reject.item' <> t1.item)) UNION SELECT 'Inconsistent-Message' FROM Seller.quote t2 WHERE ((':Seller.reject.ID' = t2.ID) AND ((':Seller.reject.item' <> t2.item) OR (':Seller.reject.price' <> t2.price))) UNION SELECT 'Inconsistent-Message' FROM Seller.accept t5 WHERE ((':Seller.reject.ID' = t5.ID) AND ((':Seller.reject.item' <> t5.item) OR (':Seller.reject.price' <> t5.price) OR (':Seller.reject.response' <> t5.response))) UNION SELECT 'Inconsistent-Message' FROM Seller.ship t8 WHERE ((':Seller.reject.ID' = t8.ID) AND (':Seller.reject.item' <> t8.item));
SELECT 'Inconsistent-Message' FROM Seller.rfq t1 WHERE ((':Seller.ship.ID' = t1.ID) AND (':Seller.ship.item' <> t1.item)) UNION SELECT 'Inconsistent-Message' FROM Seller.quote t2 WHERE ((':Seller.ship.ID' = t2.ID) AND (':Seller.ship.item' <> t2.item)) UNION SELECT 'Inconsistent-Message' FROM Seller.accept t5 WHERE ((':Seller.ship.ID' = t5.ID) AND ((':Seller.ship.item' <> t5.item) OR (':Seller.ship.address' <> t5.address))) UNION SELECT 'Inconsistent-Message' FROM Seller.reject t7 WHERE ((':Seller.ship.ID' = t7.ID) AND (':Seller.ship.item' <> t7.item));