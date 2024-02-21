DROP TABLE BOOK;

CREATE TABLE BOOK (
    book_id NUMBER CONSTRAINT PK_BOOKID PRIMARY KEY,
    title VARCHAR2(50) NOT NULL,
    author VARCHAR2(50) NOT NULL,
    publisher VARCHAR2(20) NOT NULL,
    publish_date DATE NOT NULL,
    price NUMBER NOT NULL
);

COMMENT ON COLUMN BOOK.book_id IS 'seq_bid �������� ��ȣ�߻� ó��';
COMMENT ON COLUMN BOOK.title IS 'å����';
COMMENT ON COLUMN BOOK.author IS '���ڸ�';
COMMENT ON COLUMN BOOK.publisher IS '���ǻ�';
COMMENT ON COLUMN BOOK.publish_date IS '���ǳ�¥';
COMMENT ON COLUMN BOOK.price IS '����';


DROP SEQUENCE seq_bid;

CREATE SEQUENCE seq_bid
START WITH 1
INCREMENT BY 1
NOMAXVALUE
NOCYCLE
NOCACHE;

TRUNCATE TABLE BOOK;

INSERT INTO BOOK VALUES(seq_bid.nextval, 'å����1', '����1', '���ǻ�1', TO_DATE('1991/01/02', 'RR/MM/DD'), 10000);
INSERT INTO BOOK VALUES(seq_bid.nextval, 'å����2', '����2', '���ǻ�2', TO_DATE('1991/01/02', 'RR/MM/DD'), 20000);
INSERT INTO BOOK VALUES(seq_bid.nextval, 'å����3', '����3', '���ǻ�3', TO_DATE('1991/01/03', 'RR/MM/DD'), 30000);
SELECT * FROM BOOK;

COMMIT;