

INSERT INTO Program
VALUES
  ('FF', 'Our frequent flyers program rewards you with every flight you take and for purchases with our partners', 'Frequent Flyer'  ),
  ('PL', 'Our Premier Lounge program provides you access to our airport lounges',                                  'Premiere Lounge' ),
  ('ER', 'With Extra Rewards you will earn more points for both flights and purchases',                            'Extra Rewards'   );

INSERT INTO Member
VALUES
  ('1900100020', 'ACTIVE',    '2017-08-12', 'Fred',   'Flintstone' ),
  ('1900100021', 'ACTIVE',    '2017-09-15', 'Wilma',  'Flintstone' ),
  ('1900100022', 'SUSPENDED', '2017-09-16', 'Barney', 'Rubble'     ),
  ('1900100023', 'PENDING',   '2018-11-20', 'Betty',  'Rubble'     );

INSERT INTO Member_Program
VALUES
  ('1900100020', 'FF'),
  ('1900100020', 'PL'),
  ('1900100020', 'ER'),
  ('1900100021', 'FF'),
  ('1900100021', 'PL'),
  ('1900100022', 'FF'),
  ('1900100023', 'FF');

  INSERT INTO Member_Address
  VALUES
  ('1900100020','TEST1','TEST2','SYDNEY','2020','NSW','AU'),
    ('1900100021','TEST11','TEST22','SYDNEY','2120','NSW','AU');

