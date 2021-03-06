CREATE OR REPLACE FUNCTION CALCULATE_CSTMR_FULLNAME()
  RETURNS trigger AS $$
BEGIN
  NEW.FULL_NAME = UPPER(coalesce(NEW.FIRST_NAME, '') || ' ' ||
                        coalesce(NEW.LAST_NAME, '') || ' ' ||
                        coalesce(NEW.SECOND_NAME, '') );
  RETURN NEW;
END;
$$ LANGUAGE 'plpgsql';

CREATE TRIGGER CALCULATE_CSTMR_FULLNAME
  BEFORE INSERT
  ON CUSTOMERS
  FOR EACH ROW
  EXECUTE PROCEDURE CALCULATE_CSTMR_FULLNAME();