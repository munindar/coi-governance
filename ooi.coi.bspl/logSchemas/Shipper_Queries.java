Boilerplate Goes Here
SELECT 'Inconsistent-Message' FROM Shipper.deliver t10 WHERE ((':Shipper.ship.ID' = t10.ID) AND ((':Shipper.ship.item' <> t10.item) OR (':Shipper.ship.address' <> t10.address)));
SELECT 'Inconsistent-Message' FROM Shipper.ship t9 WHERE ((':Shipper.deliver.ID' = t9.ID) AND ((':Shipper.deliver.item' <> t9.item) OR (':Shipper.deliver.address' <> t9.address)));
