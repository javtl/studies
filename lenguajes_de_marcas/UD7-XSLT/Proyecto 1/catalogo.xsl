<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="UTF-8" />
    
    <xsl:template match="/">
        <html>
            <head>
                <title>Catálogo de Libros</title>
                <style>
                    table {
                        width: 100%;
                        border-collapse: collapse;
                    }
                    th, td {
                        border: 1px solid black;
                        padding: 8px;
                        text-align: left;
                    }
                    th {
                        background-color: #f2f2f2;
                    }
                    .precio {
                        font-weight: bold;
                        color: green;
                    }
                </style>
            </head>
            <body>
                <h1>Catálogo de Libros</h1>

                <!-- Agrupar por país de publicación -->
                <xsl:for-each select="//publicacion/pais[not(. = preceding::publicacion/pais)]">
                    <h2>Libros publicados en <xsl:value-of select="." /></h2>
                    <table>
                        <tr>
                            <th>Título</th>
                            <th>Autor</th>
                            <th>Editorial</th>
                            <th>Precio</th>
                            <th>Fecha de Publicación</th>
                        </tr>
                        <xsl:for-each select="//libro[publicacion/pais = current()]">
                            <tr>
                                <td><xsl:value-of select="titulo" /></td>
                                <td><xsl:value-of select="autor" /></td>
                                <td><xsl:value-of select="editorial" /></td>
                                <td class="precio">
                                    <xsl:value-of select="precio" /> <xsl:value-of select="precio/@moneda" />
                                </td>
                                <td><xsl:value-of select="publicacion/fecha" /></td>
                            </tr>
                        </xsl:for-each>
                    </table>
                </xsl:for-each>

                <footer>
                    <p>Generado automáticamente con XSLT</p>
                </footer>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
  