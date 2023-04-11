
CREATE TABLE IF NOT EXISTS chat (
    id BIGINT PRIMARY KEY,
    username VARCHAR NOT NULL
);


CREATE TABLE IF NOT EXISTS link (
    id BIGINT PRIMARY KEY,
    url VARCHAR(2048) NOT NULL UNIQUE,
    updated_at TIMESTAMP NOT NULL
);


CREATE TABLE IF NOT EXISTS chat_link (
    chat_id BIGINT REFERENCES chat (id),
    link_id BIGINT REFERENCES link (id),
    PRIMARY KEY (chat_id, link_id)
);