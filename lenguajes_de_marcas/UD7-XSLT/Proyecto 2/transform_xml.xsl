<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="xml" encoding="UTF-8"/>

  <xsl:template match="/">
    <library>
      <xsl:for-each select="library/book/author">
        <author name="{.}">
          <xsl:for-each select="../[author=current()]">
            <book>
              <title><xsl:value-of select="title"/></title>
              <year><xsl:value-of select="year"/></year>
            </book>
          </xsl:for-each>
        </author>
      </xsl:for-each>
    </library>
  </xsl:template>
</xsl:stylesheet>
