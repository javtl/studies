# 🧠 **NotebookLM – Blockchain Developer Roadmap**

---

## 🧩 **1. Fundamentos de Blockchain y Web3**

**Objetivo:** comprender cómo funciona una blockchain, qué es la EVM, y cómo interactúan los Smart Contracts.

**Recursos:**

* [https://ethereum.org/en/learn](https://ethereum.org/en/learn) → Documentación oficial de Ethereum (conceptos base, PoS, gas, EVM).
* [https://remix.ethereum.org](https://remix.ethereum.org) → IDE online para practicar Solidity directamente en el navegador.
* [https://medium.com/@pedrolisboa_10855/getting-started-with-solidity-creating-your-first-smart-contract-f9bd92469605](https://medium.com/@pedrolisboa_10855/getting-started-with-solidity-creating-your-first-smart-contract-f9bd92469605) → Primer contrato paso a paso.
* [https://www.quicknode.com/guides/ethereum-development/smart-contracts/how-to-create-and-deploy-a-smart-contract-with-hardhat](https://www.quicknode.com/guides/ethereum-development/smart-contracts/how-to-create-and-deploy-a-smart-contract-with-hardhat) → Cómo crear y desplegar contratos con Hardhat.

---

## 💻 **2. Solidity – Nivel Inicial**

**Objetivo:** dominar la sintaxis de Solidity, las estructuras y patrones básicos.

**Recursos:**

* [https://docs.openzeppelin.com/contracts/5.x](https://docs.openzeppelin.com/contracts/5.x) → Contratos estándar ERC y utilidades seguras.
* [https://www.freecodecamp.org/news/learn-solidity-handbook/](https://www.freecodecamp.org/news/learn-solidity-handbook/) → Guía completa y gratuita de Solidity.
* [https://cryptozombies.io](https://cryptozombies.io) → Curso gamificado gratuito para aprender Solidity desde cero.
* [https://hardhat.org/tutorial](https://hardhat.org/tutorial) → Tutorial oficial de Hardhat con ejercicios prácticos.

---

## ⚙️ **3. Frameworks y Testing (Hardhat / Foundry)**

**Objetivo:** aprender a compilar, testear y desplegar Smart Contracts profesionalmente.

**Recursos:**

* [https://hardhat.org/tutorial](https://hardhat.org/tutorial) → Base completa de uso de Hardhat.
* [https://foundry.pages.dev](https://foundry.pages.dev) → Documentación oficial de Foundry.
* [https://docs.openzeppelin.com/upgrades-plugins/foundry/foundry-upgrades](https://docs.openzeppelin.com/upgrades-plugins/foundry/foundry-upgrades) → Smart Contracts actualizables con Foundry.
* [https://book.getfoundry.sh](https://book.getfoundry.sh) → Libro oficial de Foundry (testing avanzado).

**Repositorios clave:**

* [https://github.com/foundry-rs/foundry](https://github.com/foundry-rs/foundry)
* [https://github.com/NomicFoundation/hardhat](https://github.com/NomicFoundation/hardhat)

---

## 🪙 **4. Tokens ERC20 y ERC721 (NFTs)**

**Objetivo:** crear tus propios tokens fungibles y no fungibles.

**Recursos:**

* [https://docs.openzeppelin.com/contracts/5.x/erc20](https://docs.openzeppelin.com/contracts/5.x/erc20) → ERC20 estándar.
* [https://docs.openzeppelin.com/contracts/5.x/erc721](https://docs.openzeppelin.com/contracts/5.x/erc721) → ERC721 estándar (NFTs).
* [https://www.quicknode.com/guides/ethereum-development/nfts/how-to-create-and-deploy-an-nft](https://www.quicknode.com/guides/ethereum-development/nfts/how-to-create-and-deploy-an-nft) → Crear y desplegar un NFT paso a paso.

---

## 🏦 **5. DeFi: Staking, Yield Farming, Liquidity Pools, DAOs**

**Objetivo:** entender y construir protocolos DeFi reales.

**Recursos:**

* [https://docs.uniswap.org/contracts/v3](https://docs.uniswap.org/contracts/v3) → Documentación de Uniswap.
* [https://ethereum.org/en/developers/tutorials/uniswap-v2-annotated-code](https://ethereum.org/en/developers/tutorials/uniswap-v2-annotated-code) → Explicación del código de Uniswap V2.
* [https://github.com/Uniswap](https://github.com/Uniswap) → Repositorio oficial.
* [https://github.com/aave/aave-v3-core](https://github.com/aave/aave-v3-core) → Ejemplo de protocolo Lending & Borrowing.
* [https://docs.chain.link/quickstarts/foundry-chainlink-toolkit](https://docs.chain.link/quickstarts/foundry-chainlink-toolkit) → Integración de Chainlink (oráculos, feeds, VRF).

---

## 🧰 **6. Seguridad y Auditoría de Smart Contracts**

**Objetivo:** aprender a evitar vulnerabilidades y realizar auditorías básicas.

**Recursos:**

* [https://consensys.github.io/smart-contract-best-practices/](https://consensys.github.io/smart-contract-best-practices/) → Guía oficial de seguridad.
* [https://github.com/OpenZeppelin/ethernaut](https://github.com/OpenZeppelin/ethernaut) → Juego interactivo de auditoría real.
* [https://docs.chainstack.com/docs/introduction-to-smart-contract-manual-auditing-with-foundry-and-slither](https://docs.chainstack.com/docs/introduction-to-smart-contract-manual-auditing-with-foundry-and-slither) → Introducción a la auditoría manual.
* [https://github.com/crytic/slither](https://github.com/crytic/slither) → Analizador estático de contratos.

**Temas clave:**

* Reentrancy, overflow, frontrunning, ownership, permisos.
* Testing con Foundry + fuzzing.

---

## 🔗 **7. Firmas, Oráculos y Upgradeable Contracts**

**Objetivo:** conectar el mundo off-chain y mejorar la arquitectura de tus contratos.

**Recursos:**

* [https://eips.ethereum.org/EIPS/eip-712](https://eips.ethereum.org/EIPS/eip-712) → Firmas tipadas.
* [https://eips.ethereum.org/EIPS/eip-2612](https://eips.ethereum.org/EIPS/eip-2612) → Permit en ERC20.
* [https://docs.chain.link/vrf/v2/introduction](https://docs.chain.link/vrf/v2/introduction) → Oráculos y aleatoriedad verificable.
* [https://docs.openzeppelin.com/upgrades-plugins/foundry/foundry-upgrades](https://docs.openzeppelin.com/upgrades-plugins/foundry/foundry-upgrades) → Contratos actualizables.

---

## 🌐 **8. Frontend + Integración Web3**

**Objetivo:** conectar tus Smart Contracts a una interfaz web funcional.

**Recursos:**

* [https://docs.ethers.org/v6/](https://docs.ethers.org/v6/) → Documentación oficial de Ethers.js.
* [https://web3js.readthedocs.io/](https://web3js.readthedocs.io/) → Documentación de Web3.js.
* [https://barrettk.hashnode.dev/creating-your-first-full-stack-dapp-with-solidity-hardhat-and-react](https://barrettk.hashnode.dev/creating-your-first-full-stack-dapp-with-solidity-hardhat-and-react) → Tutorial completo de DApp con React + Hardhat.
* [https://github.com/ChainSafe/web3.js](https://github.com/ChainSafe/web3.js) → Repositorio de Web3.js.

---

## 📁 **9. Portfolio, CV y Empleabilidad Web3**

**Objetivo:** mostrar tu experiencia técnica y conseguir oportunidades laborales.

**Recursos:**

* [https://github.com](https://github.com) → Publica tus proyectos.
* [https://ethglobal.com](https://ethglobal.com) → Participa en hackathons Web3.
* [https://encode.club](https://encode.club) → Comunidad y retos blockchain.
* [https://www.linkedin.com/learning/topics/blockchain](https://www.linkedin.com/learning/topics/blockchain) → Cursos de perfil profesional.

---

## 🧾 **10. Repositorios de referencia profesional**

**Código abierto de proyectos reales:**

* [https://github.com/OpenZeppelin/openzeppelin-contracts](https://github.com/OpenZeppelin/openzeppelin-contracts)
* [https://github.com/Uniswap/v3-core](https://github.com/Uniswap/v3-core)
* [https://github.com/aave/aave-v3-core](https://github.com/aave/aave-v3-core)
* [https://github.com/ethereum/ethereum-org-website](https://github.com/ethereum/ethereum-org-website)
* [https://github.com/PatrickAlphaC](https://github.com/PatrickAlphaC) → Ejemplos completos (Chainlink, Hardhat, DeFi).

