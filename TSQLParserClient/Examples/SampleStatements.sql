INSERT INTO dbo.Makes(Make) VALUES('FORD'),('TOYOTA');

INSERT INTO dbo.Models(Model) VALUES('F150'),('PRIUS');

INSERT INTO dbo.ModelYears(ModelID,ModelYear)
SELECT M.ModelID,years.yr
FROM dbo.Models AS M
CROSS JOIN (
	SELECT '2010-01-01' AS yr UNION ALL
	SELECT '2011-01-01' AS yr UNION ALL
	SELECT '2012-01-01' AS yr UNION ALL
	SELECT '2013-01-01' AS yr UNION ALL
	SELECT '2014-01-01' AS yr UNION ALL
	SELECT '2015-01-01' AS yr UNION ALL
	SELECT '2016-01-01' AS yr UNION ALL
	SELECT '2017-01-01' AS yr UNION ALL
	SELECT '2018-01-01' AS yr UNION ALL
	SELECT '2019-01-01' AS yr UNION ALL
	SELECT '2012-01-01' AS yr
) AS years;

INSERT INTO dbo.MakeModelYears(MakeID,ModelYearID)
SELECT M.MakeID, MY.ModelYearID
FROM  dbo.Makes AS M
CROSS JOIN dbo.ModelYears AS MY;

INSERT INTO dbo.BodyStyles(BodyStyle) VALUES ('SEDAN'),('COUPE'),('CONVERTABLE'),('HATCHBACK');

INSERT INTO dbo.TrimOptions(TrimOption) VALUES('TOWING-S+'),('SAFETY-B12'),('NAVIGATION-P23'),('APPEARANCE')

INSERT INTO dbo.BodyStyleTrimOptions(BodyStyleID,TrimOptionID)
SELECT	BS.BodyStyleID,
		TOPS.TrimOptionID
FROM dbo.BodyStyles AS BS
CROSS JOIN dbo.TrimOptions AS TOPS


INSERT INTO dbo.MakeModelYearBodyStyleTrimOptions(MakeModelYearID,BodyStyleTrimOptionID)
SELECT	MMY.MakeModelYearID, BSTO.BodyStyleTrimOptionID
FROM	dbo.MakeModelYears AS MMY
CROSS JOIN dbo.BodyStyleTrimOptions AS BSTO

INSERT INTO dbo.FuelTypes(FuelType) VALUES ('GAS'),('DIESAL'),('ELECTRIC'),('HYBRID'),('ALL')

INSERT INTO dbo.Engines(EngineName,FuelTypeID,CylinderCount)
VALUES ('USA-All-Tank16C',5,16),
       ('TESLA-EBRICK',3,6),
	   ('AUTOSTONE-GE-V-8',1,8)

INSERT INTO dbo.MakeModelYearEngines(MakeModelYearID,EngineID)
SELECT	MMY.MakeModelYearID, E.EngineID
FROM	dbo.MakeModelYears AS MMY
CROSS JOIN  dbo.Engines AS E
JOIN dbo.ModelYears AS MY ON MMY.ModelYearID = MY.ModelYearID
WHERE	MY.ModelYear <> '2015' 
	AND MakeID <> 2;

INSERT INTO dbo.Automobiles(MakeModelYearID,BodyStyleTrimOptionID,EngineID)
SELECT	MMYE.MakeModelYearID,
		MMYBSTOP.BodyStyleTrimOptionID,
		E.EngineID
FROM	dbo.MakeModelYearEngines AS MMYE
CROSS JOIN  dbo.Engines AS E
JOIN   dbo.MakeModelYearBodyStyleTrimOptions AS MMYBSTOP ON MMYE.MakeModelYearID = MMYBSTOP.MakeModelYearID
JOIN dbo.ModelYears AS MY ON MMYE.MakeModelYearID = MY.ModelYearID


SELECT * FROM DBO.AutoOptionsView