INSERT INTO PRODUCT (ID, NAME, SKU, PRICE, DESCRIPTION, CREATED_AT, UPDATED_AT)
VALUES
(gen_random_uuid(), 'Smartphone Galaxy X20', 'SMGX20-BLK', 999.99, 'Smartphone com tela AMOLED de 6.5", 128GB de armazenamento e 8GB de RAM', CURRENT_TIMESTAMP, NULL),
(gen_random_uuid(), 'Notebook UltraBook Pro', 'ULTP-15-SLV', 2499.99, 'Notebook ultrafino com processador i7, 16GB RAM, 512GB SSD e tela 15.6"', CURRENT_TIMESTAMP, NULL),
(gen_random_uuid(), 'Fone de Ouvido Wireless', 'HDPHN-WL-BLK', 149.99, 'Fones com cancelamento de ruído, bluetooth 5.0 e bateria de longa duração', CURRENT_TIMESTAMP, NULL),
(gen_random_uuid(), 'Smart TV 55" LED 4K', 'TV55-4K-SMART', 1899.99, 'TV com resolução 4K, HDR10+, sistema operacional próprio e conectividade Wi-Fi', CURRENT_TIMESTAMP, NULL),
(gen_random_uuid(), 'Câmera DSLR Profissional', 'CAM-DSLR-PRO', 1299.50, 'Câmera com 24.2MP, gravação 4K e kit com lente 18-55mm', CURRENT_TIMESTAMP, NULL),
(gen_random_uuid(), 'Tablet Premium 10"', 'TAB-10-PRO', 799.00, 'Tablet com tela 10", processador octa-core, 6GB RAM e 128GB armazenamento', CURRENT_TIMESTAMP, NULL),
(gen_random_uuid(), 'Console de Jogos NextGen', 'GAME-NG-1TB', 2999.99, 'Console com 1TB SSD, processador de última geração, suporte a jogos 4K', CURRENT_TIMESTAMP, NULL),
(gen_random_uuid(), 'Smartwatch Fitness', 'SWTCH-FIT-BLK', 299.50, 'Relógio inteligente com monitor cardíaco, GPS, resistente à água e bateria de 7 dias', CURRENT_TIMESTAMP, NULL),
(gen_random_uuid(), 'Impressora Multifuncional', 'PRINT-MULT-CLR', 399.99, 'Impressora com scanner, copiadora, Wi-Fi e impressão frente e verso automática', CURRENT_TIMESTAMP, NULL),
(gen_random_uuid(), 'Drone com Câmera HD', 'DRONE-HD-PRO', 899.00, 'Drone com câmera HD, alcance de 5km, 30 minutos de voo e recursos de gravação automática', CURRENT_TIMESTAMP, NULL);