JAVAC = javac
JAVA = java
SRC_DIR = ../src
BIN_DIR = .
MAIN_CLASS = HexagonalGrid

SOURCES = $(SRC_DIR)/HexagonalButton.java \
          $(SRC_DIR)/HexagonalGrid.java 

CLASSES = $(patsubst $(SRC_DIR)/%.java,$(BIN_DIR)/%.class,$(SOURCES))

default: run

${BIN_DIR}/%.class: $(SRC_DIR)/%.java
	@mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $<

all: $(CLASSES)

run: all
	$(JAVA) -cp $(BIN_DIR) $(MAIN_CLASS)


clean:
	rm -rf $(BIN_DIR)/*.class
    

info:
	@echo "SOURCES: $(SOURCES)"
	@echo "CLASSES: $(CLASSES)"

.PHONY: default all run clean info
