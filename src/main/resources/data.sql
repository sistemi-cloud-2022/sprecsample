INSERT INTO `centrifugations` (`id`, `temp`, `delay`, `speed`, `braking`, `acronym`)
VALUES
	(2,'2 to 10°C','10 to 15 min','<3000g','no braking','C'),
	(3,'20 to 10°C','10 to 15 min','<3000g','with braking','D'),
	(4,'2 to 10°C','10 to 15 min','>10000g','with braking','J'),
	(5,'2 to 10°C','10 to 15 min','3000g to 6000g','with braking','F'),
	(6,'2 to 10°C','10 to 15 min','6000g to 10000g','with braking','H'),
	(7,'No centrifugation','No centrifugation','No centrifugation','No centrifugation','N'),
	(8,'Other','Other','Other','Other','Z'),
	(9,'RT','10 to 15 min','<3000g','no braking','A'),
	(10,'RT','10 to 15 min','<3000g','with braking','B'),
	(11,'RT','10 to 15 min','>10000g','with braking','I'),
	(12,'RT','10 to 15 min','3000g to 6000g','with braking','E'),
	(13,'RT','10 to 15 min','6000g to 10000g','with braking','G'),
	(14,'RT','30 min','<1000g','no braking','M'),
	(15,'Unknown','Unknown','Unknown','Unknown','X');

INSERT INTO `collection_types` (`id`, `denomination`, `acronym`)
VALUES
	(1,'Autopsy < 6 h post-mortem','A06'),
	(2,'Autopsy 06-12 h post-mortem','A12'),
	(3,'Autopsy 12-24 h post-mortem','A24'),
	(4,'Autopsy 24-48 h post-mortem','A48'),
	(5,'Autopsy 48-72 h post-portem','A72'),
	(6,'Biopsy','BPS'),
	(7,'Biopsy in culture media','BCM'),
	(8,'Biopsy in normal saline or phosphate buffered saline','BSL'),
	(9,'Biopsy in tissue low temperature transport media','BTM'),
	(10,'Fine needle aspirate','FNA'),
	(11,'Other','ZZZ'),
	(12,'Punction','PUN'),
	(13,'Surgical excision','SRG'),
	(14,'Surgical excision in culture media','SCM'),
	(15,'Surgical excision in normal saline or phosphate buffered saline','SSL'),
	(16,'Surgical excision in tissue low temperature transport media','STM'),
	(17,'Surgical excision in vacuum container','VAC'),
	(18,'Swab','SWB');

INSERT INTO `fixation_stabilizations` (`id`, `denomination`, `acronym`)
VALUES
	(1,'Alcohol-based','ETH'),
	(2,'Aldehyde-based','ALD'),
	(3,'Allprotect tissue reagent','ALL'),
	(4,'Heat stabilization','HST'),
	(5,'Neutral buffered formalin','NBF'),
	(6,'Non-aldehyde based without acetic acid','NAA'),
	(7,'Non-aldehyde with acetic acid','ACA'),
	(8,'Non-buffered formalin','FOR'),
	(9,'Optimum cutting temperature medium','OCT'),
	(10,'Other','ZZZ'),
	(11,'PAXgene tissue','PXT'),
	(12,'RNA Later','RNL'),
	(13,'Snap freezing','SNP'),
	(14,'Unknown','XXX');

INSERT INTO `fixation_times` (`id`, `denomination`, `acronym`)
VALUES
	(1,'< 15 min','A'),
	(2,'15 min-1 h','B'),
	(3,'1-4 h ','C'),
	(4,'4-8 h','D'),
	(5,'8-24 h','E'),
	(6,'24-48 h','F'),
	(7,'48-72 h','G'),
	(8,'Not applicable','N'),
	(9,'Unknown','X'),
	(10,'Other','Z');

INSERT INTO `long_term_storages` (`id`, `container`, `temp`, `acronym`)
VALUES
	(1,'Bag','Liquid Nitrogen','Q'),
	(2,'Cryotube 1 to 2 mL','(-85) to (-60) °C','D'),
	(3,'Cryotube 1 to 2 mL','Liquid Nitrogen','C'),
	(4,'Cryotube 1 to 2 mL','LN after temporary (-85) to (-60) °C','N'),
	(5,'Cryotube 1 to 2 mL','Programmable freezing to < -135 °C','E'),
	(6,'Dry technology medium','RT','R'),
	(7,'Microplate','(-35) to (-18) °C','M'),
	(8,'Microplate','(-85) to (-60) °C','L'),
	(9,'Original primary container','(-35) to (-18) °C','Y'),
	(10,'Original Primary Container','(-85) to (-60) °C','Y'),
	(11,'Other','Other','Z'),
	(12,'Paraffin Block','2 to 10 °C','P'),
	(13,'Paraffin Block','RT','P'),
	(14,'Plastic cryo straw','Liquid Nitrogen','F'),
	(15,'Plastic cryo straw','LN after temporary (-85) to (-60) °C','O'),
	(16,'PP tube >= 5 mL','(-35) to (-18) °C','K'),
	(17,'PP tube >= 5 mL','(-85) to (-60) °C','J'),
	(18,'PP tube 0.5 to 2 mL','(-35) to (-18) °C','B'),
	(19,'PP tube 0.5 to 2 mL','(-85) to (-60) °C','A'),
	(20,'PP tube 0.5 to 2 mL','< -135 °C','V'),
	(21,'PP tube 40 to 500 uL','(-35) to (-18) °C','T'),
	(22,'PP tube 40 to 500 uL','(-85) to (-60) °C','S'),
	(23,'PP tube 40 to 500 uL','< -135 °C','W'),
	(24,'Straw','(-35) to (-18) °C','H'),
	(25,'Straw','(-85) to (-60) °C','G'),
	(26,'Straw','Programmable freezing to < -135 °C','I'),
	(27,'Unknown','Unknown','X');

INSERT INTO `post_centrifugations` (`id`, `temp`, `delay`, `acronym`)
VALUES
	(1,'2 to 10°C','<1 h','A'),
	(2,'RT','<1 h','B'),
	(3,'2 to 10°C','>24 h','I'),
	(4,'RT','>24 h','J'),
	(5,'2 to 10°C','1 to 2 h','C'),
	(6,'RT','1 to 2 h','D'),
	(7,'2 to 10°C','2 to 8 h','E'),
	(8,'RT','2 to 8 h','F'),
	(9,'2 to 10°C','8 to 24 h','G'),
	(10,'RT','8 to 24 h','H'),
	(11,'2 to 10°C','N','N'),
	(12,'Other','N','N'),
	(13,'RT','N','N'),
	(14,'Unknown','N','N'),
	(15,'Unknown','Not Applicable','N'),
	(16,'Other','Other','Z'),
	(17,'Unknown','Other','X'),
	(18,'Unknown','Unknown','X'),
	(19,'Other','Unknown','X');

INSERT INTO `pre_centrifugations` (`id`, `temp`, `delay`, `acronym`)
VALUES
	(1,'2 to 10°C','< 2 h','B'),
	(2,'2 to 10°C','> 48 h','N'),
	(3,'2 to 10°C','12 to 24 h','J'),
	(4,'2 to 10°C','2 to 4 h','D'),
	(5,'2 to 10°C','24 to 48 h','L'),
	(6,'2 to 10°C','4 to 8 h','F'),
	(7,'2 to 10°C','8 to 12 h','H'),
	(8,'2 to 10°C','Unknown','X'),
	(9,'35 to 38°C','< 2 h','O'),
	(10,'35 to 38°C','Unknown','X'),
	(11,'Other','Unknown','X'),
	(12,'RT','< 2 h','A'),
	(13,'RT','> 48 h','M'),
	(14,'RT','12 to 24 h','I'),
	(15,'RT','2 to 4 h','C'),
	(16,'RT','24 to 48 h','K'),
	(17,'RT','4 to 8 h','E'),
	(18,'RT','8 to 12 h','G'),
	(19,'RT','Unknown','X'),
	(20,'Unknown','Unknown','X');

INSERT INTO `primary_containers` (`id`, `denomination`, `acronym`)
VALUES
	(1,'Acid citrate dextrose','ACD'),
	(2,'Chemical additives/stabilizers','ADD'),
	(3,'Serum tube without clot activator','CAT'),
	(4,'Citrate phosphate dextrose','CPD'),
	(5,'Cell Preparation Tube citrate','CPT'),
	(6,'Cell Preparation Tube heparin','CPH'),
	(7,'Aldehyde-based stabilizer for CTCs','CSV'),
	(8,'EDTA and gel','EDG'),
	(9,'Physical filtration system','FIL'),
	(10,'Glass','GLS'),
	(11,'Lithium Heparin','HEP'),
	(12,'Hirudin','HIR'),
	(13,'Lithium heparin and rubber plug','LHB'),
	(14,'Lithium heparin and gel','LHG'),
	(15,'Oragene collection container or equivalent','ORG'),
	(16,'Stool collection container with DNA stabilizer','OMN'),
	(17,'PAXgene blood RNA+','PAX'),
	(18,'Potassium EDTA','PED'),
	(19,'Polyethylene tube sterile','PET'),
	(20,'S8820 protease inhibitor tablets or equivalent','PI1'),
	(21,'Protease inhibitors','PIX'),
	(22,'Polypropylene tube sterile','PPS'),
	(23,'PAXgene blood DNA','PXD'),
	(24,'PAXgene bone marrow RNA','PXR'),
	(25,'RNA Later','RNL'),
	(26,'Sodium Citrate','SCI'),
	(27,'Nonaldehyde-bsaed stabilizer for cell-free nucleic acids','SCK'),
	(28,'Sodium EDTA','SED'),
	(29,'Sodium Heparin','SHP'),
	(30,'Sodium fluoride/potassium oxalate','SPO'),
	(31,'Serum separator tube with clot activator','SST'),
	(32,'Tempus Tube','TEM'),
	(33,'Trace elements tube','TRC'),
	(34,'Unknown','XXX'),
	(35,'Other','ZZZ');

INSERT INTO `warm_ischemias` (`id`, `denomination`, `acronym`)
VALUES
	(1,'< 2 min','A'),
	(2,'2-10 min','B'),
	(3,'10-20 min','C'),
	(4,'20-30 min','D'),
	(5,'30-60 min','E'),
	(6,'> 60 min','F'),
	(7,'Unknown','X'),
	(8,'Not applicable (e.g. biopsy)','N'),
	(9,'Other','Z');

INSERT INTO `sprec_samples` (`id`, `sample_id`, `sprec`, `sample_type`, `collection_type`, `primary_container`, `pre_centrifugation`, `post_centrifugation`, `centrifugation`, `second_centrifugation`, `long_term_storage`, `warm_ischemia`, `cold_ischemia`, `fixation_type`, `fixation_time`, `created_at`, `updated_at`, `deleted_at`)
VALUES
	(1,2,'CEN-A06-B-B-HST-C-D',38,1,NULL,NULL,NULL,NULL,NULL,2,2,2,4,3,'2019-08-08 13:19:51','2019-08-08 13:19:51',NULL),
	(2,2,'CEN-A06-B-B-ALL-B-D',38,1,NULL,NULL,NULL,NULL,NULL,2,2,2,3,2,'2019-08-08 13:20:32','2019-08-08 13:20:32',NULL),
	(3,1,'CLN-A12-B-B-ACA-G-T',39,2,NULL,NULL,NULL,NULL,NULL,21,2,2,7,7,'2019-09-09 13:13:44','2019-09-09 13:13:44',NULL),
	(4,3,'AMN-ADD-J-N-N-J-N',2,NULL,2,3,4,7,7,4,NULL,NULL,NULL,NULL,'2019-09-19 08:27:27','2019-09-19 08:27:27',NULL),
	(5,4,'AMN-CAT-B-C-C-B-X',2,NULL,3,1,2,2,2,27,NULL,NULL,NULL,NULL,'2019-09-30 14:24:19','2019-09-30 14:24:19',NULL),
	(6,5,'AMN-ACD-N-J-N-J-N',2,NULL,1,2,4,4,7,4,NULL,NULL,NULL,NULL,'2020-10-20 14:19:09','2020-10-20 14:19:09',NULL);